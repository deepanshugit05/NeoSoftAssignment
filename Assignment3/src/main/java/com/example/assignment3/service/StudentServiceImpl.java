package com.example.assignment3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment3.dto.ProjectDto;
import com.example.assignment3.dto.StudentDto;
import com.example.assignment3.entity.Project;
import com.example.assignment3.entity.Student;
import com.example.assignment3.repo.ProjectRepo;
import com.example.assignment3.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Autowired
	ProjectRepo projectRepo;

	@Override
	public Student saveStudent(StudentDto studentDto) {
		try {
			Student student = new Student();
			student.setFirstName(studentDto.getFirstName());
			student.setLastName(studentDto.getLastName());
			student.setPhoneNumber(studentDto.getPhoneNumber());
			student.setProjects(getProjectList(studentDto, student));
			return studentRepo.save(student);

		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	private List<Project> getProjectList(StudentDto studentDto, Student student) {
		List<Project> projectList = new ArrayList<>();
		
		List<ProjectDto> projectdtoList = studentDto.getProjects();
			for (ProjectDto projectDto : projectdtoList) {
				projectList.add(new Project(projectDto.getProjectName(), projectDto.getProjectDuration(), student));
			}

		return projectList;
	}
	
}
