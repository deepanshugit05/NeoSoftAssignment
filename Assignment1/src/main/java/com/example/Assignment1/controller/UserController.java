package com.example.Assignment1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment1.Entity.User;
import com.example.Assignment1.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/saveUser")
	public ResponseEntity<List<User>> saveUser(@RequestBody User user){
		
		return new ResponseEntity<>(userService.saveUser(user),HttpStatus.OK);
	}
	
}
