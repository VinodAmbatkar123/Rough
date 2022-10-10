package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Book;
import com.example.demo.service.IBookStoreService;

@RestController
@Scope("request")
public class BookStoreController {

	@Autowired
	@Qualifier("bookstoreService")
	private IBookStoreService bookstoreService;
	
	@RequestMapping("/")
	public String Home() {
		return "Welcome To BookStore world";
	}
	
	@GetMapping(value = "/book", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getAllBooks(){
		return bookstoreService.getAllBooks();
		
	}
}
