package com.example.libraryManagement.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String bookName;
    private String auther;

    public Book(){}
    
    // GETTERS 

    public Long getId(){return this.Id;}
    public String getBookName(){return this.bookName;}
    public String getAuther(){return this.auther;}

    // SETTERS 

    public void setId(Long id){ this.Id=id;}
    public void setBookName(String bookName){ this.bookName=bookName;}
    public void setAuther(String auther){ this.auther=auther;}

}
