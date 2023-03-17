package com.example.Assignment1.exception;

import java.util.List;

public class ErrorDetails {

	private String errorCode;
	
	private String message;
	
	private List<String> errorList;

	
	public ErrorDetails(String errorCode, String message, List<String> errorList) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.errorList = errorList;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}

	@Override
	public String toString() {
		return "ErrorDetails [errorCode=" + errorCode + ", message=" + message + ", errorList=" + errorList + "]";
	}

}
