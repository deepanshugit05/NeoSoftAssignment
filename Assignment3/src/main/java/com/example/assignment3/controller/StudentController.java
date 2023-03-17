package com.example.assignment3.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment3.dto.ProjectStudentDto;
import com.example.assignment3.dto.StudentDto;
import com.example.assignment3.entity.Student;
import com.example.assignment3.service.ProjectService;
import com.example.assignment3.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@Autowired
	private ProjectService projectservice;
	
	@PostMapping("/insert")
	public ResponseEntity<?> save(@Valid @RequestBody StudentDto student) {
		return new ResponseEntity<>(service.saveStudent(student),HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllStudent(){
		return new ResponseEntity<>(service.getAllStudent(),HttpStatus.OK);
	}
	
	
	@GetMapping("/findByProjectName/{projectName}")
	public ResponseEntity<?> findByProjectName(@PathVariable("projectName") @NotNull String projectName){
		if(projectName.equals("null")) {
			return new ResponseEntity<>("ProjectName Is null",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(projectservice.findByProjectName(projectName),HttpStatus.OK);
	}
	

	/*
	 * @GetMapping("/findByStudent") public List<Student> findByStudent(){ return
	 * service.getAllStudent(); }
	 */
	
}
