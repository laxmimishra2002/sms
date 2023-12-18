package com.sms.service;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.sms.dto.Registration;

@Component
public interface StudentService {

	public int addStudent(Registration registration);
	public Registration update(Registration student);
	public void delete(Long studentId);
	public Iterable<Registration>  list();
	public  Optional<Registration> getStudentDetail(Long id);
}
