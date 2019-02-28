package com.check24.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.check24.bookstore.model.BooksView;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@Component
public interface BooksViewRepository extends JpaRepository<BooksView, Long>{
	BooksView findByBookId(Long id);
}
