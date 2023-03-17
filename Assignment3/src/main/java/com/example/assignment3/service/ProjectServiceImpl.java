package com.example.assignment3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment3.dto.ProjectStudentDto;
import com.example.assignment3.entity.Project;
import com.example.assignment3.repo.ProjectRepo;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepo projectRepo;

	@Override
	public ProjectStudentDto findByProjectName(String projectName) {
		ProjectStudentDto projectDto = new ProjectStudentDto();
		List<Project> projects = projectRepo.findByProjectName(projectName);
		if(!projects.isEmpty()){
		Project project = projects.get(0);
		projectDto.setProjectId(project.getProjectId());
		projectDto.setProjectName(project.getProjectName());
		projectDto.setProjectDuration(project.getProjectDuration());
		projectDto.setStudent_id(project.getStudent().getStudent_id());
		projectDto.setFirstName(project.getStudent().getFirstName());
		projectDto.setLastName(project.getStudent().getLastName());
		projectDto.setPhoneNumber(project.getStudent().getPhoneNumber());
		}else {
			System.out.println("List is empty");
		}
		return projectDto;
	}


}
