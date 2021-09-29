package com.cg.customer.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.customer.entity.Loan;

@Repository
public interface ICustomerLoanDao extends JpaRepository<Loan, Integer> {
	
	@Query("from Loan where custid=:id")
	List<Loan> findByCustId( @Param("id") int id);
	
	@Query("from Loan where custid=:id and applicationid=:appid")
	Optional<Loan> findByAppId( @Param("id") int id, @Param("appid") int appid);

}
