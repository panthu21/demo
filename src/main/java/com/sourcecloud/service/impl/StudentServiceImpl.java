package com.sourcecloud.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sourcecloud.model.Student;
import com.sourcecloud.repository.StudentRepository;
import com.sourcecloud.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo; 
	
	
	@Override
	public Student getStudent(String id) {
		
		Optional<Student>  stOp = studentRepo.findById(Integer.valueOf(id));
		return stOp.get();
	}

}
