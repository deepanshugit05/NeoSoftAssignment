package com.example.Assignment1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_Id")
	private int userId;

	@NotEmpty(message = "Name may not be null")
	@Pattern(regexp="^[a-zA-Z\\s]*$" , message="Not valid Character for Name")
	@Column(name="user_Name",unique=true)
	private String name;

	
	@NotEmpty(message = "Email may not be null")
	@Email
	@Column(name="user_email",unique=true)
	private String email;

	@NotNull(message = "Phone not be null")
	@Pattern(regexp="\\d{10}" , message="Not valid Phone Number")	
	@Column(name="user_phoneNumber",unique=true)
	private String phoneNumber;
	
	
	public User(int userId,
			@NotEmpty(message = "Name may not be null") @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Not valid Character for Name") String name,
			@NotEmpty(message = "Email may not be null") @Email String email,
			@NotNull(message = "Phone not be null") @Pattern(regexp = "\\d{10}", message = "Not valid Phone Number") String phoneNumber) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
    
}
