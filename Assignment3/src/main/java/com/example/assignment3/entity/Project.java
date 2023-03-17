package com.example.assignment3.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "projectTable")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projectId;

	@Column(unique = true)
	private String projectName;

	private LocalDateTime projectDuration;

	@ManyToOne
	@JoinColumn(name = "student_id")
	@JsonBackReference
	private Student student;

	public Project(String projectName, LocalDateTime projectDuration, Student student) {
		super();
		this.projectName = projectName;
		this.projectDuration = projectDuration;
		this.student = student;
	}

	/*
	 * public Project(int projectId, String projectName, LocalDateTime
	 * projectDuration, Student student) { super(); this.projectId = projectId;
	 * this.projectName = projectName; this.projectDuration = projectDuration;
	 * this.student = student; }
	 * 
	 * public Project(String projectName, LocalDateTime projectDuration, Student
	 * student) { super(); this.projectName = projectName; this.projectDuration =
	 * projectDuration; this.student = student; }
	 * 
	 * public Project() { super(); // TODO Auto-generated constructor stub }
	 * 
	 * public int getProjectId() { return projectId; }
	 * 
	 * public void setProjectId(int projectId) { this.projectId = projectId; }
	 * 
	 * public String getProjectName() { return projectName; }
	 * 
	 * public void setProjectName(String projectName) { this.projectName =
	 * projectName; }
	 * 
	 * public LocalDateTime getProjectDuration() { return projectDuration; }
	 * 
	 * public void setProjectDuration(LocalDateTime projectDuration) {
	 * this.projectDuration = projectDuration; }
	 * 
	 * public Student getStudent() { return student; }
	 * 
	 * public void setStudent(Student student) { this.student = student; }
	 * 
	 * @Override public String toString() { return "Project [projectId=" + projectId
	 * + ", projectName=" + projectName + ", projectDuration=" + projectDuration +
	 * ", student=" + student + "]"; }
	 */

}
