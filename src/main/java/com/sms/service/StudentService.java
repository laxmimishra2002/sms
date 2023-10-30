package com.sms.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sms.dto.Registration;

@Component
public interface StudentService {

	public int addStudent(Registration registration);
	public Registration update(Registration student);
	public void delete(Registration student);
	public Iterable<Registration>  list();
}
