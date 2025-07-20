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
    // DELETE A BOOK
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
    // CREATE A BOOK
    public void createBook(Book book){
        bookRepository.save(book);
    }
    // UPDATE A BOOK
    public Book updateBook(Long id, Book newBook){ 
        return bookRepository.findById(id)
            .map( book->{
                book.setBookName(newBook.getBookName());
                book.setAuther(newBook.getAuther());
                return bookRepository.save(book);
            })                .orElseThrow(() -> new RuntimeException("Book not found"));

    }
}
