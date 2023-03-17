package com.example.Assignment1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment1.Entity.Employee;
import com.example.Assignment1.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(empService.saveEmployee(employee), HttpStatus.OK);
	}
	
	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<Employee>> getEmployee() {
		return new ResponseEntity<>(empService.getAllEmployee(), HttpStatus.OK);
	}

	@GetMapping("/getEmployeeByDepartment/{departmentName}")
	public ResponseEntity<List<Employee>> getEmployeeByDepartment(@PathVariable("departmentName") String department) {
		return new ResponseEntity<>(empService.getEmployeeByDepartment(department), HttpStatus.OK);
	}
	
	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		return new ResponseEntity<>(empService.updateEmployee(employee), HttpStatus.OK);
	}
}
