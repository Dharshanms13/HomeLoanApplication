package com.cg.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.customer.entity.UserDetails;

@Repository
public interface ICustomerRegisterDao extends JpaRepository<UserDetails, String> {
	
}
