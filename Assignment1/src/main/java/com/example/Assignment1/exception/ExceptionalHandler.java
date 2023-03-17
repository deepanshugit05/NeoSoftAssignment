package com.example.Assignment1.exception;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionalHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = ConstraintViolationException.class)
	public ResponseEntity<ErrorDetails> handleExceptions(ConstraintViolationException ex){
		List<String> errorList=ex.getConstraintViolations().stream().map(e -> e.getMessage()).collect(Collectors.toList());
		ErrorDetails errorDetails=new ErrorDetails("ASS400", ex.getMessage(), errorList);
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	
	@ResponseStatus(HttpStatus.CONFLICT)
	@ExceptionHandler(value = DataIntegrityViolationException.class)
	public ResponseEntity<ErrorDetails> handleExceptions(DataIntegrityViolationException ex){
		List<String> errorList=new ArrayList<>();
		errorList.add("Duplicate Entry found, Please Provide different Project Name");
		ErrorDetails errorDetails=new ErrorDetails("ASS409", ex.getMessage(), errorList);
		return new ResponseEntity<>(errorDetails,HttpStatus.CONFLICT);
	}
	
	@ResponseStatus(HttpStatus.FOUND)
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorDetails> handleExceptions(Exception ex){
		List<String> errorList=new ArrayList<>();
		errorList.add("Error Occured In Bussiness Layer");
		ErrorDetails errorDetails=new ErrorDetails("ASS302", ex.getMessage(), errorList);
		return new ResponseEntity<>(errorDetails,HttpStatus.FOUND);
	}
}
