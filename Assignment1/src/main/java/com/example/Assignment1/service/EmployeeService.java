package com.example.Assignment1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assignment1.Dao.EmployeeRepo;
import com.example.Assignment1.Entity.Employee;
import java.util.List;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo empRepo;
	
	public Employee saveEmployee(Employee employee){
		return empRepo.save(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return empRepo.findAll();
	}

	public List<Employee> getEmployeeByDepartment(String department) {
		return empRepo.findByEmpDepartment(department);
	}

	public Employee updateEmployee(Employee employee) {
		return empRepo.save(employee);
	}
}
