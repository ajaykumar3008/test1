package com.spring.publishing.BookPublishing.DAOcomponents;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.publishing.BookPublishing.contractors.BookPublishers;
import com.spring.publishing.BookPublishing.models.Book;
import com.spring.publishing.BookPublishing.models.Publisher;
import com.spring.publishing.BookPublishing.rowmappers.BookRowMapper;
import com.spring.publishing.BookPublishing.rowmappers.PublisherRowMapper;

@Component
public class BookPublisherDAO implements BookPublishers {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Book> getAllBooks() {

		return jdbc.query("select * from _book", new BookRowMapper());
	}

	@Override
	public void addNewBook(Book book) {
		String query = "insert into _books values(?,?,?,?,?,?,?)";
		Object[] params = { book.getId(), book.getTitle(), book.getAuthor(), book.getPublicationYear(), book.getIsbn(),
				book.getTopic(), book.getPublisher() };
		jdbc.update(query, params);

	}

	@Override
	public void updateBook(Book book) {
		String query = "update _books set title=?,author=?,publicationyear=?,isbn=?,genre=?,publisherid=? where id=?";
		Object[] params = { book.getTitle(), book.getAuthor(), book.getPublicationYear(), book.getIsbn(),
				book.getTopic(), book.getPublisher(), book.getId() };
		jdbc.update(query, params);

	}

	@Override
	public void deleteBook(int bookId) {

		String query = "delete from _books where id=?";
		Object[] params = { bookId };
		jdbc.update(query, params);
	}

	@Override
	public List<Publisher> getAllPublishers() {

		return jdbc.query("select * from book_publisher_", new PublisherRowMapper());
	}

}
