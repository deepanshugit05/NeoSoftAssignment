package com.example.assignment3.dto;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class ProjectStudentDto {
	
	private int projectId;
	
	private String projectName;
	
	private LocalDateTime projectDuration;
	
	private int student_id;

	private String firstName;

	private String lastName;

	private String phoneNumber;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ProjectStudentDto() {
		super();
	}

	public ProjectStudentDto(int projectId, String projectName, LocalDateTime projectDuration, int student_id,
			String firstName, String lastName, String phoneNumber) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDuration = projectDuration;
		this.student_id = student_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public LocalDateTime getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(LocalDateTime projectDuration) {
		this.projectDuration = projectDuration;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "ProjectStudentDto [projectId=" + projectId + ", projectName=" + projectName + ", projectDuration="
				+ projectDuration + ", student_id=" + student_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	    
}
