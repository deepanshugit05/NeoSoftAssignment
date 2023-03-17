package com.example.assignment2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="Employee_Table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	
	@NotEmpty(message = "Name may not be null")
	private String empName;
	
	@NotEmpty(message = "Department may not be null")
	private String empDepartment;
	
	@Range(min=1000 ,message = "Salary must have min 4 number")
	@NotNull(message = "Salary may not be null")
	private double empSalary;
	
	@NotEmpty(message = "City may not be null")
	private String empCity;

	/*
	 * public int getEmpId() { return empId; }
	 * 
	 * public void setEmpId(int empId) { this.empId = empId; }
	 * 
	 * public String getEmpName() { return empName; }
	 * 
	 * public void setEmpName(String empName) { this.empName = empName; }
	 * 
	 * public String getEmpDepartment() { return empDepartment; }
	 * 
	 * public void setEmpDepartment(String empDepartment) { this.empDepartment =
	 * empDepartment; }
	 * 
	 * public double getEmpSalary() { return empSalary; }
	 * 
	 * public void setEmpSalary(double empSalary) { this.empSalary = empSalary; }
	 * 
	 * public String getEmpCity() { return empCity; }
	 * 
	 * public void setEmpCity(String empCity) { this.empCity = empCity; }
	 * 
	 * @Override public String toString() { return "Employee [empId=" + empId +
	 * ", empName=" + empName + ", empDepartment=" + empDepartment + ", empSalary="
	 * + empSalary + ", empCity=" + empCity + "]"; }
	 */
}
