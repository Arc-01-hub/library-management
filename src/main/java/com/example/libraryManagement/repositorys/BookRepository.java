package com.example.libraryManagement.repositorys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagement.entitys.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}