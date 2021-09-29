package com.cg.customer.service;

import java.util.List;

import com.cg.customer.entity.Customer;

public interface ICustomerService {

	Customer register(Customer customerList);

	List<Customer> findAll();

	Customer findById(int id);

}
