package com.example.assignment3.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment3.entity.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer>{
	
	List<Project> findByProjectName(String name);
	
	
	/*
	 * @Query("Select p.project_id, p.projectName, p.projectDuration, s.student_id, s.firstName, s.lastName, s.phoneNumber"
	 * +
	 * "from projectTable p inner join studentTable s where p.projectName = : projectName"
	 * ) List<Project> findByProjectName(String name);
	 */
}
