package com.spring.publishing.BookPublishing.models;

public class Book {
	private int id;
	private String title;
	private String author;
	private Integer publicationYear;
	private String isbn;
	private String topic;
	private int publisher;

	public Book() {

	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Integer getPublicationYear() {
		return publicationYear;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTopic() {
		return topic;
	}

	public int getPublisher() {
		return publisher;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublicationYear(Integer publicationYear) {
		this.publicationYear = publicationYear;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}

}
