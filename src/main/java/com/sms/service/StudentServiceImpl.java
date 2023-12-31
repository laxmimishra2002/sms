/**
 * 
 */
package com.sms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sms.dto.Registration;
import com.sms.repository.StudentRepository;

/**
 * 
 */
@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Override
	public int addStudent(Registration registration) {
		// TODO Auto-generated method stub
		validate(registration);
		studentRepository.save(registration);

		

		return 1;
	}
	private int validate(Registration registration) {
		if (!registration.getEmail().contains("@")) {
		return 0;
		}
		if (registration.getPhone_no().length() != 10) {
			return 0;
			}

		if (registration.getStudentname() == null) {
			return 0;
			
		}

		if (registration.getFather_name() == null) {
			return 0;

		}

		if (registration.getMother_name() == null) {
			return 0;

		}

		if (registration.getDob() == null) {
			return 0;

		}

		if (registration.getBlood_group() == ' ') {
			return 0;

		}

		if (registration.getPassword() == null) {
			return 0;

		}

		if (registration.getAddress() == null) {
			return 0;

		}

		if (registration.getDepartment() == null) {
			return 0;

		}

		if (registration.getCourse() == null) {
			return 0;

		}
		return 1;
	}
	@Override
	public Registration update(Registration student) {
		
		return studentRepository.save(student);
	}
	public void delete(Long studentId) {
		 studentRepository.deleteById(studentId);
	}
	@Override
	public Iterable<Registration> list() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
		 
	}
	@Override
	public  Optional<Registration> getStudentDetail(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

}
