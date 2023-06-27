package com.rushab.rest.Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.lang.model.element.Name;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String age;
    @Column
    private String occupation;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getOccupation(){
        return occupation;
    }
    public void setOccupation(String occupation)    {
        this.occupation=occupation;
    }




}
