package com.mphasis.bookstore.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.bookstore.domain.Book;

@Repository("bookRepository")
@Scope("singleton")
public interface BookRepository extends JpaRepository<Book,Integer>{

}
