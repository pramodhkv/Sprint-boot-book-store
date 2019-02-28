package com.check24.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.check24.bookstore.model.Books;
import com.check24.bookstore.model.BooksView;
import com.check24.bookstore.repository.BooksRepository;
import com.check24.bookstore.repository.BooksViewRepository;


@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping("/task")
public class BookStoreController {
	
	@Autowired
    private BooksRepository booksRepository;
	
	@Autowired
    private BooksViewRepository booksViewRepository;
	
	@GetMapping(value = "/books")
    public List<Books> findAll() {
		System.out.println(booksRepository.findAll());
        return booksRepository.findAll();
    }
	
	@PostMapping(value="/details")
    public BooksView storeBooksView(@RequestBody final BooksView bookView) {
    	System.out.println("inside details method");
    	System.out.println(bookView.toString());
    	booksViewRepository.save(bookView);
    	BooksView detail = booksViewRepository.findByBookId(bookView.getBookId());
    	System.out.println(detail);
    	return detail;
    }

}
