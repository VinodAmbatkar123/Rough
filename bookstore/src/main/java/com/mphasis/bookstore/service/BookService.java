package com.mphasis.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mphasis.bookstore.domain.Book;
import com.mphasis.bookstore.repository.BookRepository;
@Service("bookService")
@Scope("singleton")
public class BookService implements IBookService {
	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;
	
	

	@Override
	public Book save(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public Book update(Book book) {
		return bookRepository.save(book);
		
		
	}

	@Override
	public void delete(int id) {
		bookRepository.deleteById(id);
		
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

}
