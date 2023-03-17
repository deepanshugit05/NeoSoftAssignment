package com.example.Assignment1.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Assignment1.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	List<User> findByName(String name);
	
	List<User> findByEmail(String email);
	
	List<User> findByPhoneNumber(String phoneNumber);
	
	@Query("Select e from User e where e.name=?1 and e.email=?2 and e.phoneNumber=?3" )
	List<User> findByByNameEmailPhoneNumber(String name, String email, String phoneNumber);
}
