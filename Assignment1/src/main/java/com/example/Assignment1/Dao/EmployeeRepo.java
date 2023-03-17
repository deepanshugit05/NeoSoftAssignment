package com.example.Assignment1.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Assignment1.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	List<Employee> findByEmpDepartment(String name);
	
}
