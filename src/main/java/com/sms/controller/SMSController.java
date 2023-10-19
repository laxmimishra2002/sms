package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.dto.Registration;
import com.sms.service.StudentService;

@RestController
public class SMSController {
	@Autowired
	StudentService studentservice;
	
    @GetMapping("/student")
	public Registration getStudent() {
    	Registration regis=new Registration();
    	regis.setAddress("LKO");
		return regis;
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
	@PutMapping("/student /update")
	public HttpStatus updateStudent(@RequestBody Student student) {
		return(null);
		@DeleteMapping("/student/delete")
		public HttpStatus deleteStudent(@RequestBody Student student) {
			return(id);
		}
	}
	
}
