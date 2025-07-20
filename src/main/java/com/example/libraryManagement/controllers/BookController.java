package com.example.libraryManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libraryManagement.entitys.Book;
import com.example.libraryManagement.services.BookService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private final BookService booksService;
    public BookController(BookService booksService){
        this.booksService = booksService;
    }
    
    @GetMapping
    public List<Book> getAllBooks(){
        return booksService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getOneBook(@PathVariable Long id){
        return booksService.getOneBook(id)
                .map(book -> ResponseEntity.ok(book))
                .orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        booksService.deleteBook(id);
    }
    @PostMapping("/create")
    public void createBook(Book book){
        booksService.createBook(book);
    }
    @PutMapping("/update/{id}")
    public void createBook(@PathVariable Long id, Book book){
        booksService.updateBook(id,book);
    }
    
}
