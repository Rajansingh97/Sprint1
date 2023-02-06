package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Admin;

@Repository
public interface AdminDAO extends CrudRepository<Admin,Integer>{
	

}
