package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")    //Using this annotation to specify spring do not use singelton pattern. (Always create new object)
public class User {
    
    private Integer id;
    private String name;
    private String tech;
    
    @Autowired
    @Qualifier("samsung")    //Specify qualifier
    private Laptop laptop;

    public User() {
        super();
        System.out.println("Object created");
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    
//    public Laptop getLaptop() {
//        return laptop;
//    }
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
    public void show() {
        System.out.println("in show");
        laptop.compile();
    }
    

}
