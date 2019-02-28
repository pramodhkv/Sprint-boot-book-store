package com.check24.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BooksView {
	
	@Column(name="id")
	private Long bookId;
	
	@Column(name="book_name")
	private String bookName;
	
	private String username;
	
	public BooksView() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
    @GeneratedValue
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "BooksView [bookId=" + bookId + ", bookName=" + bookName + ", username=" + username + "]";
	}
	
}