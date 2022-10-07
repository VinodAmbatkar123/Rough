package com.mphasis.bookstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books_Details")
public class Book {
	@Id
	@Column(name="Book_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Book_title")
	private String title;
	@Column(name="Book_publisher")
	private String publisher;
	@Column(name="Book_year")
	private double year;
	
	
	
	public Book() {}
	public Book(int id, String title, String publisher, double year) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publisher=" + publisher + ", year=" + year + "]";
	}
	

}
