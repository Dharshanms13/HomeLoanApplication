package com.cg.customer.util;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.customer.dto.CustomerDetails;
import com.cg.customer.entity.Customer;

@Component
public class CustomerUtil {

	public CustomerDetails toDetails(Customer customer) {
		return new CustomerDetails(customer.getId(), customer.getName(), customer.getMobileNumber(), 
					customer.getEmaild(), customer.getDob(), customer.getGender(), customer.getNationality(), 
					customer.getAadharNumber(), customer.getPan());
	}

	public List<CustomerDetails> toDetails(List<Customer> customers) {
		List<CustomerDetails> custList = new ArrayList<>();
		for (Customer customer: customers) {
			CustomerDetails details = toDetails(customer);
//			System.out.println(details);
			custList.add(details);
		}
		return custList;
	}

}
