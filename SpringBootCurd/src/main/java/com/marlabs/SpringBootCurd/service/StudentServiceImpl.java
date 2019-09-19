package com.marlabs.SpringBootCurd.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.marlabs.SpringBootCurd.model.Student;
import com.marlabs.SpringBootCurd.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public String studentRegistration(Student stu) {
		
		
		try {
			Student student=new Student();
			student.setSid(1234);
			student.setSname(stu.getSname());
			student.setMobilenumber(stu.getMobilenumber());
			student.setAddress(stu.getAddress());
			studentRepository.save(student);
		}
		catch(Exception e) {
			
		}
		return "Success";
	}

}
