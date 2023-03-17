package com.example.Assignment1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assignment1.Dao.UserRepo;
import com.example.Assignment1.Entity.User;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public List<User> saveUser(User user){
		
		List<User> userList=new ArrayList<>();
		
		userRepo.save(user);
		
		/*
		 * userRepo.findByName(user.getName()).forEach(user1 -> userList.add(user1));
		 * 
		 * userRepo.findByEmail(user.getEmail()).forEach(user1 -> userList.add(user1));
		 * 
		 * userRepo.findByPhoneNumber(user.getPhoneNumber()).forEach(user1 ->
		 * userList.add(user1));
		 */
		
		userList=userRepo.findByByNameEmailPhoneNumber(user.getName(),user.getEmail(),user.getPhoneNumber());
		
		return userList;
	}
	
}
