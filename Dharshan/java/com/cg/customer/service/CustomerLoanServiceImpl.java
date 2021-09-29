package com.cg.customer.service;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.customer.dao.ICustomerLoanDao;
import com.cg.customer.entity.Loan;
import com.cg.customer.entity.LoanTracker;
import com.cg.customer.exception.CustomerApplicationNotFoundException;
import com.cg.customer.exception.CustomerNotFoundException;

@Service
@Transactional
public class CustomerLoanServiceImpl implements ICustomerLoanService {
	
	@Autowired
	private ICustomerLoanDao dao;
	
	private Logger logger = Logger.getLogger(CustomerLoanServiceImpl.class);

	@Override
	public Loan findByCustId(int id, int appid) {
		List<Loan> loanList = dao.findByCustId(id);
		if(!(loanList.size()>0)) {
			logger.error("No loans applied by Customer with id : " + id);
			throw new CustomerNotFoundException("No loans applied by Customer with id : " + id);
		}
		Optional<Loan> opt1 = dao.findByAppId(id, appid);
		if(!opt1.isPresent()) {
			logger.error("Application with id : " + appid + " not present for Customer id : " + id);
			throw new CustomerApplicationNotFoundException("Application with id : " + appid + " not present for Customer id : " + id);
		}
		Loan loan = opt1.get();
		System.out.println(loan);
		return loan;
	}

	@Override
	public Loan register(Loan loan) {
		loan = dao.save(loan);
		System.out.println(loan);
		return loan;
	}

	@Override
	public List<Loan> findByCustId(int id) {
		List<Loan> loanList = dao.findByCustId(id);
		if(!(loanList.size()>0)) {
			logger.error("No loans applied by Customer with id : " + id);
			throw new CustomerNotFoundException("No loans applied by Customer with id : " + id);
		}
		return loanList;
	}

	@Override
	public LoanTracker loanTracker(Loan loan) {
		
		LoanTracker lt = new LoanTracker();
		
		lt.setStatus(loan.getStatus());
		
		if(loan.isFinanceverify() == false)
			lt.setFinanceApproval("Finance Approval Required");
		else
			lt.setFinanceApproval("Finance Details Approved");
		
		if(loan.isLandverify() == false)
			lt.setLandApproval("Land Approval Required");
		else
			lt.setLandApproval("Land Details Approved");
		
		if(loan.isAdminapprove() == false)
			lt.setAdminApproval("Admin Approval Required");
		else
			lt.setAdminApproval("Admin Approved");
		
		return lt;
	}

	@Override
	public void remove(int id) {
		dao.deleteById(id);
	}
	
	

}
