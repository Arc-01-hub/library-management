package com.example.libraryManagement.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private int age;

    public User(){}

    // GETTERS
    public Long getId(){return this.Id;}
    public String getName(){return this.name;}
    public int getAge(){return this.age;}

    // SETTERS
    public void setId(Long id){this.Id=id;}
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;
}
}
