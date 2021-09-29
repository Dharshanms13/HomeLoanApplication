package com.cg.customer.service;

import com.cg.customer.dto.UserDetailsDto;
import com.cg.customer.entity.UserDetails;

public interface ICustomerRegister {

	UserDetails register(UserDetails uDetails);

	UserDetails findByName(UserDetailsDto userDetails);

	UserDetails findByName(String uName);

	UserDetails register1(UserDetails udetails);


}
