package com.example.assignment2.exception;

public class NullParameterException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public NullParameterException() {
	}

	public NullParameterException(String msg) {
		super(msg);
		this.message = msg;
	}
}
