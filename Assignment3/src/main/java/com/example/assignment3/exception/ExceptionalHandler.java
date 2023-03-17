package com.example.assignment3.exception;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> handleExceptions(MethodArgumentNotValidException ex){
		List<String> errorList=ex.getFieldErrors().stream().map(e -> e.getDefaultMessage()).collect(Collectors.toList());
		ErrorDetails errorDetails=new ErrorDetails("ASS400", ex.getMessage(), errorList);
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	
	/*
	 * @ResponseStatus(HttpStatus.FOUND)
	 * 
	 * @ExceptionHandler(value = SQLIntegrityConstraintViolationException.class)
	 * public ResponseEntity<ErrorDetails>
	 * handleExceptions(SQLIntegrityConstraintViolationException ex){ List<String>
	 * errorList=new ArrayList<>(); errorList.add("Duplicate Entry found.");
	 * ErrorDetails errorDetails=new ErrorDetails("ASS302", ex.getMessage(),
	 * errorList); return new ResponseEntity<>(errorDetails,HttpStatus.FOUND); }
	 */

	/*
	 * @ResponseStatus(HttpStatus.BAD_REQUEST)
	 * 
	 * @ExceptionHandler(value = NullParameterException.class) public
	 * ResponseEntity<ErrorDetails> handleExceptions(NullParameterException ex){
	 * List<String> errorList=new ArrayList<>();
	 * errorList.add("Bad Request , Please provided valid input."); ErrorDetails
	 * errorDetails=new ErrorDetails("ASS400", ex.getMessage(), errorList); return
	 * new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST); }
	 * 
	 * @ResponseStatus(HttpStatus.NOT_FOUND)
	 * 
	 * @ExceptionHandler(value = EmployeeNotFoundException.class) public
	 * ResponseEntity<ErrorDetails> handleExceptions(EmployeeNotFoundException ex){
	 * List<String> errorList=new ArrayList<>();
	 * errorList.add("Employee not found , Please provided valid input.");
	 * ErrorDetails errorDetails=new ErrorDetails("ASS302", ex.getMessage(),
	 * errorList); return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND); }
	 */
	
	

}
