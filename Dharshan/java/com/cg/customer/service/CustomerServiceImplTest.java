package com.cg.customer.service;

import java.sql.Date;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.customer.entity.Customer;

@ExtendWith({ SpringExtension.class })
@DataJpaTest
@Import(CustomerServiceImpl.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CustomerServiceImplTest {

	@Autowired
	private ICustomerService service;

	@Autowired
	private EntityManager em;

	@Test
	void testRegister() {
		Customer cust = new Customer("dharshan", 9012345678L, "dharshan@gmail.com", new Date(1999 - 05 - 13), "male",
				"Indian", 890123456789L, "strinh123");
		em.persist(cust);
		Integer id = cust.getId();
		Customer custFound = service.findById(id);
		Assertions.assertEquals(custFound.getName(), "dharshan");
	}

//	@Test
//	void testFindAll() {
//		List<Customer> cList = service.findAll();
//		boolean success = false;
//		if(cList.size() < 0 ) {
//			success = true;
//		}
//		assertTrue(success);
//	}
//
	@Test
	void testFindById() {
		Customer cust = new Customer("dharshan", 9012345678L, "dharshan@gmail.com", new Date(1999 - 05 - 13), "male",
				"Indian", 890123456789L, "strinh123");
		em.persist(cust);
		Integer id = cust.getId();
		Customer custFound = service.findById(id);
		Assertions.assertEquals(custFound.getName(), "dharshan");
	}

}
