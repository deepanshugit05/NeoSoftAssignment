package com.example.assignment3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment3.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
