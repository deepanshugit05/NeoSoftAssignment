package com.example.assignment2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment2.repo.EmployeeRepo;
import com.example.assignment2.entity.Employee;
import com.example.assignment2.exception.EmployeeNotFoundException;
import com.example.assignment2.exception.NullParameterException;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo empRepo;
	
	public Employee saveEmployee(Employee employee){
		return empRepo.save(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return empRepo.findAll();
	}

	public List<Employee> getEmployeeByDepartment(String department) {
		System.out.println("Depanrtment "+department+"123");
		if(department.equals("null")) {
			throw new NullParameterException("Department Id Value is Null, Please insert valid input");
		}
		return empRepo.findByEmpDepartment(department);
	}

	public Employee updateEmployee(Employee employee) {
		if(employee.getEmpId()==0) {
			throw new NullParameterException("Employee Id Value is Null, Please insert valid input");
		}
		System.out.println("Employee "+employee.toString());
		Optional<Employee> emp=empRepo.findById(employee.getEmpId());
		if(!emp.isPresent())
		{
			throw new EmployeeNotFoundException("Employee not found with Id :"+employee.getEmpId());
		}else
			return empRepo.save(employee);
	}

}
