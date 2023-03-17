package com.example.assignment3.dto;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProjectDto {

	private int projectId;
	
	@NotEmpty(message = "ProjectName cannot be null, Please provide valid data")
	@Size(min = 2, message = "LastName should have at least 2 characters")
	private String projectName;
	
	@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
	private LocalDateTime projectDuration;;
	
	public ProjectDto() {
		super();
	}

	public ProjectDto(int projectId,
			@NotEmpty(message = "ProjectName cannot be null, Please provide valid data") String projectName,
			LocalDateTime projectDuration) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDuration = projectDuration;
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

	@Override
	public String toString() {
		return "ProjectDto [projectId=" + projectId + ", projectName=" + projectName + ", projectDuration="
				+ projectDuration + "]";
	}

}
