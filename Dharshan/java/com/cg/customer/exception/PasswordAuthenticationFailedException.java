package com.cg.customer.exception;

public class PasswordAuthenticationFailedException extends RuntimeException {

	public PasswordAuthenticationFailedException(String message) {
		super(message);
	}

}
