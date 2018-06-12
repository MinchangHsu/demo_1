package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.MinTbCustomerJpa;

public interface CustomerRepository extends JpaRepository<MinTbCustomerJpa, Long>{
	
//	@Query(" FROM MIN_TB_CUSTOMER ")
	List<MinTbCustomerJpa> findAll();
	
//	@Query(value = "SELECT * FROM MIN_TB_CUSTOMER WHERE CUSTOMER_ID = :CUSTOMER_ID ", nativeQuery = true)
//	MinTbCustomerJpa findByCustomerId(@Param("CUSTOMER_ID")int CUSTOMER_ID);
	
	//@Param("CUSTMER_ID")
	MinTbCustomerJpa findByCustomerId(int CUSTOMER_ID);
	
	MinTbCustomerJpa findByCustomerUserId(String CUSTOMER_USER_ID);
	
	
	MinTbCustomerJpa findByCustomerUserIdAndCustomerOpertora(String CUSTOMER_USER_ID,int customerOpertor);
	
	
}
