package com.spring.publishing.BookPublishing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.publishing.BookPublishing.models.Book;
import com.spring.publishing.BookPublishing.models.Publisher;
import com.spring.publishing.BookPublishing.repositories.BookPublisherRepository;

@RestController
public class BookPublisherController {

	BookPublisherRepository bookRepo;

	@Autowired
	public BookPublisherController(BookPublisherRepository bookRepo) {

		this.bookRepo = bookRepo;
	}

	// to get all books list
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> getBooks() {
		return bookRepo.getAllBooks();
	}

	// for adding the new book to the database
	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public ResponseEntity<Object> addBook(Book book) {
		bookRepo.addNewBook(book);
		return new ResponseEntity("Book Added Successfully", HttpStatus.OK);
	}

	// for updating the book details
	@RequestMapping(value = "/updatebook", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateBook(Book book) {
		bookRepo.updateBook(book);
		return new ResponseEntity("Book Updated Successfully", HttpStatus.OK);
	}

	// for deleting the book from database
	@RequestMapping(value = "/deletebook", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteBook(int bookId) {
		bookRepo.deleteBook(bookId);
		return new ResponseEntity("Book Deleted Successfully", HttpStatus.OK);
	}

	// for getting the all books according to the publisher by their id
	@RequestMapping(value = "/book-by-publisher", method = RequestMethod.GET)
	public List<Book> getBooksByPublisher(int bookId) {

		return bookRepo.getPublishersById(bookId);
	}

	// getting all publishers
	@RequestMapping(value = "/publishers", method = RequestMethod.GET)
	public List<Publisher> getPublishers() {
		return bookRepo.getAllPublishers();
	}

}
