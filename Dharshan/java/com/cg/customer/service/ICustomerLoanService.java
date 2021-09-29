package com.cg.customer.service;

import java.util.List;

import com.cg.customer.entity.Loan;
import com.cg.customer.entity.LoanTracker;

public interface ICustomerLoanService {

	Loan register(Loan loan);

	Loan findByCustId(int id, int appid);

	List<Loan> findByCustId(int id);

	LoanTracker loanTracker(Loan loan);

	void remove(int id);

}
