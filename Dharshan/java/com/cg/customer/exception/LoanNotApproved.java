package com.cg.customer.exception;

public class LoanNotApproved extends RuntimeException{
	
	public LoanNotApproved(String message) {
		super(message);
	}
}
