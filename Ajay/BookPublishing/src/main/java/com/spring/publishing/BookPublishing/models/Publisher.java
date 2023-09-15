package com.spring.publishing.BookPublishing.models;

public class Publisher {

	private int id;
	private String name;
	private int foundedYear;
	private String address;
	private String website;
	private String contactEmail;
	private String phoneNumber;
	private String description;

	public Publisher() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFoundedYear() {
		return foundedYear;
	}

	public String getAddress() {
		return address;
	}

	public String getWebsite() {
		return website;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFoundedYear(int foundedYear) {
		this.foundedYear = foundedYear;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
