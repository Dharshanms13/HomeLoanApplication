package com.cg.customer.exception;

public class CustomerAlreadyExistsException extends RuntimeException {
	
	public CustomerAlreadyExistsException(String msg) {
		super(msg);
	}

}
