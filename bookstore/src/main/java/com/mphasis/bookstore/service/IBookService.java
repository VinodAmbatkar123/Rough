package com.mphasis.bookstore.service;

import java.util.List;

import com.mphasis.bookstore.domain.Book;

public interface IBookService {
	Book save(Book book);
	Book update(Book book);
	void delete(int id);
	List<Book> getAllBooks();

}
