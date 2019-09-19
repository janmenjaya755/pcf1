package com.marlabs.SpringBootCurd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.SpringBootCurd.model.Student;
import com.marlabs.SpringBootCurd.service.StudentService;
@EnableAutoConfiguration
@RestController
public class Controller {
@Autowired
StudentService studentservice;
	@RequestMapping("/studentRegistration")
	public String studentRegistration(@RequestBody Student student) {
		
		studentservice.studentRegistration(student);
		return "Success";
	}
	

}
