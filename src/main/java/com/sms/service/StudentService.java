package com.sms.service;

import org.springframework.stereotype.Component;

import com.sms.dto.Registration;

@Component
public interface StudentService {

	public int addStudent(Registration registration);
	public int update(Registration student);
	public int delete(Registration student);
}
