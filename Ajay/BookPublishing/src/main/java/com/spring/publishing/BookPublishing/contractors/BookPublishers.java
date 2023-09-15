package com.spring.publishing.BookPublishing.contractors;

import java.util.List;

import com.spring.publishing.BookPublishing.models.Book;
import com.spring.publishing.BookPublishing.models.Publisher;

public interface BookPublishers {

	List<Book> getAllBooks();

	void addNewBook(Book book);

	void updateBook(Book book);

	void deleteBook(int bookId);

	List<Publisher> getAllPublishers();

}
