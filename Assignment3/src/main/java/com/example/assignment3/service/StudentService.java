package com.example.assignment3.service;

import java.util.List;

import com.example.assignment3.dto.StudentDto;
import com.example.assignment3.entity.Student;

public interface StudentService {

	public Student saveStudent(StudentDto studentDto);
	
	public List<Student> getAllStudent();
}
