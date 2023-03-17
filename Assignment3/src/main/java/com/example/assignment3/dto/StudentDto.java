package com.example.assignment3.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class StudentDto {

	@NotEmpty(message = "FirstName cannot be null, Please provide valid data")
	@Size(min = 2, message = "FirstName should have at least 2 characters")
	@Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Firstname is not valid, Please provide valid data")
	private String firstName;

	@NotEmpty(message = "LastName cannot be null, Please provide valid data")
	@Size(min = 2, message = "LastName should have at least 2 characters")
	@Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Lastname is not valid, Please provide valid data")
	private String lastName;

	@NotEmpty(message = "Phone Number cannot be null, Please provide valid data")
	@Pattern(regexp = "\\d{10}", message = "Phone Number is not valid, Please provide valid data")
	private String phoneNumber;

	@NotEmpty(message = "Project cannot be null, Please provide Project details")
	private List<ProjectDto> projects;

	
	
	
	
	
	
	
	
	
	
	
	
	

	public StudentDto(

			@NotEmpty(message = "FirstName cannot be null, Please provide valid data") @Size(min = 2, message = "FirstName should have at least 2 characters") @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Firstname is not valid, Please provide valid data") String firstName,

			@NotEmpty(message = "LastName cannot be null, Please provide valid data") @Size(min = 2, message = "LastName should have at least 2 characters") @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Lastname is not valid, Please provide valid data") String lastName,

			@NotEmpty(message = "Phone Number cannot be null, Please provide valid data") @Pattern(regexp = "\\d{10}", message = "Phone Number is not valid, Please provide valid data") String phoneNumber,

			@NotEmpty(message = "Project cannot be null, Please provide valid data") List<ProjectDto> projects) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.projects = projects;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		firstName = firstName.trim();
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		lastName = lastName.trim();
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<ProjectDto> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectDto> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "StudentDto [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", projects=" + projects + "]";
	}

}
