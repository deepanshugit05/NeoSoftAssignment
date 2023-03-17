package com.example.assignment2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment2.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	List<Employee> findByEmpDepartment(String name);
}

