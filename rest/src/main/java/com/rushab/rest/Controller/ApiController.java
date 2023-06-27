package com.rushab.rest.Controller;

import com.rushab.rest.Models.User;
import com.rushab.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage()
    {
        return "Welcome";
    }
    @GetMapping(value="/users")
    public List<User>  getUsers()
    {
        return userRepo.findAll();
    }
    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved...";
    }
    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable Long id ,@RequestBody User user){
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setName(user.getName());
        updatedUser.setAge(user.getAge());
        updatedUser.setOccupation(user.getOccupation());
        userRepo.save(updatedUser);
        return "Updated";
    }
    @DeleteMapping(value = "delete/{id}")
    public String deleteUser(@PathVariable Long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "deleted user of id:" +id;
    }
}
