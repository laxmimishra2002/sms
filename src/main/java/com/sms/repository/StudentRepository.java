package com.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sms.dto.Registration;

@Repository
public interface StudentRepository extends CrudRepository<Registration, Long>{

	
}
