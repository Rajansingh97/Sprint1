package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.model.Customer;

@Repository
public interface CustomerDAO extends CrudRepository<Customer,Integer>{
	

}