package com.example.assignment3.service;

import com.example.assignment3.dto.ProjectStudentDto;

public interface ProjectService {
	
	public ProjectStudentDto findByProjectName(String projectName);

}
