package com.spring.publishing.BookPublishing.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.publishing.BookPublishing.models.Publisher;

public class PublisherRowMapper implements RowMapper<Publisher> {

	@Override
	public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
		Publisher p = new Publisher();

		p.setId(rs.getInt(1));
		p.setName(rs.getString(2));
		p.setFoundedYear(rs.getInt(3));
		p.setAddress(rs.getString(4));
		p.setWebsite(rs.getString(5));
		p.setContactEmail(rs.getString(6));
		p.setPhoneNumber(rs.getString(7));
		p.setDescription(rs.getString(8));
		return p;
	}

}
