package com.mphasis.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.bookstore.domain.Book;
import com.mphasis.bookstore.service.IBookService;

@RestController
@Scope("request")
public class BookController {
	@Autowired
	@Qualifier("bookService")
	private IBookService bookService;
	
	@RequestMapping("/")
	 public String dummyMethod() {
		 return "welcome to Springbboot";
	 }
	
	
	
	
	@GetMapping(value="/book",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}

}
