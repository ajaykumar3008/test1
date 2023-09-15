package com.spring.publishing.BookPublishing.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.publishing.BookPublishing.models.Book;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setId(rs.getInt(1));
		book.setAuthor(rs.getString(3));
		book.setIsbn(rs.getString(5));
		book.setTopic(rs.getString(6));
		book.setPublicationYear(rs.getInt(4));
		book.setTitle(rs.getString(2));
		book.setPublisher(rs.getInt(7));
		return book;
	}

}
