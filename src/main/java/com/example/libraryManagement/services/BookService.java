package com.example.libraryManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.libraryManagement.entitys.Book;
import com.example.libraryManagement.repositorys.BookRepository;

@Service
public class BookService {
    
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //GET ALL BOOKS

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    //GET ONE BOOK BY ID
    public Optional<Book> getOneBook(Long id){
        return bookRepository.findById(id);
    }
}
