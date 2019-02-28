package com.check24.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.check24.bookstore.model.Books;

@Component
public interface BooksRepository extends JpaRepository<Books, Long>{

}
