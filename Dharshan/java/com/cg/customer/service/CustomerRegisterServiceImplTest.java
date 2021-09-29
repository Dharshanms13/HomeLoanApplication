package com.cg.customer.service;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.customer.entity.UserDetails;

@ExtendWith({ SpringExtension.class })
@DataJpaTest
@Import(CustomerRegisterServiceImpl.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CustomerRegisterServiceImplTest {

	@Autowired
	private ICustomerRegister service;

	@Autowired
	private EntityManager em;
	@Test
	void testFindByNameString() {
		UserDetails uDetails = new UserDetails("Dharshan", "dharshan123", "User", 10);
		em.persist(uDetails);
		String uName = uDetails.getUsername();
		UserDetails uDetailsFound = service.findByName(uName);
		Assertions.assertEquals(uDetailsFound.getUsername(), "Dharshan");
	}


}
