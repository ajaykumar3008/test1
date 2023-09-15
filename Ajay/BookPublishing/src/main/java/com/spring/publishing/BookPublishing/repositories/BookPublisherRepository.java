package com.spring.publishing.BookPublishing.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.publishing.BookPublishing.DAOcomponents.BookPublisherDAO;
import com.spring.publishing.BookPublishing.models.Book;
import com.spring.publishing.BookPublishing.models.Publisher;

@Repository
public class BookPublisherRepository {

	BookPublisherDAO bookDAO;

	@Autowired
	public BookPublisherRepository(BookPublisherDAO bookDAO) {

		this.bookDAO = bookDAO;
	}

	public List<Book> getAllBooks() {
		return bookDAO.getAllBooks();
	}

	public void addNewBook(Book book) {
		bookDAO.addNewBook(book);

	}

	public void updateBook(Book book) {
		bookDAO.updateBook(book);
	}

	public void deleteBook(int bookId) {
		bookDAO.deleteBook(bookId);
	}

	public List<Publisher> getAllPublishers() {
		return bookDAO.getAllPublishers();
	}

	public List<Book> getPublishersById(int Id) {
		List<Book> books = getAllBooks();
		List<Book> publisherBooks = new ArrayList<>();
		for (Book book : books) {
			if (book.getPublisher() == Id) {
				publisherBooks.add(book);
			}
		}

		return publisherBooks;
	}
}
