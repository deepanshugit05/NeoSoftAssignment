package com.example.assignment2.service;

import java.util.List;

import com.example.assignment2.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();

	public List<Employee> getEmployeeByDepartment(String department) ;

	public Employee updateEmployee(Employee employee);
}
