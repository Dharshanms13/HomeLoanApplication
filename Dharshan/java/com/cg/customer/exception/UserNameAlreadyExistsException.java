package com.cg.customer.exception;

public class UserNameAlreadyExistsException extends RuntimeException {

	public UserNameAlreadyExistsException(String message) {
		super(message);
	}
	
}
