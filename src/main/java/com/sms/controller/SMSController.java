package com.sms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.dto.Registration;
import com.sms.service.StudentService;


@CrossOrigin(exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials","Access-Control-Allow-Origin"})

@RestController
public class SMSController {
	@Autowired
	StudentService studentservice;
    @GetMapping("/student/list")
	public Iterable<Registration>  getStudent() {
    	return studentservice.list();
		
	}
    
    @PostMapping("/student/add")
    public HttpStatusCode addStudent(@RequestBody Registration registration) {
    	System.out.println(registration.toString());
    	int result=studentservice.addStudent(registration);
    	if (result==0){
    		return HttpStatus.BAD_REQUEST;
    				
    	}
    	
    	
    	return HttpStatus.OK;
    }
    
    
	@PutMapping("/student/update/{id}")
	public HttpStatus updateStudent(@RequestBody Registration registration,@PathVariable Long id) {
		
		studentservice.update(registration);
		return HttpStatus.CREATED;
		
		
	}
	@DeleteMapping("/student/delete/{id}")
	
	public HttpStatus deleteStudent(@PathVariable Long id) {
		
		studentservice.delete(id);
		return HttpStatus.OK;


	}
	
	@GetMapping("/student/{id}")
	public  Optional<Registration> getStudentDetail(@PathVariable Long id) {
		return studentservice.getStudentDetail(id);
	}
}
