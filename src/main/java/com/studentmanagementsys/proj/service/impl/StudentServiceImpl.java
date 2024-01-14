package com.studentmanagementsys.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagementsys.proj.entity.Student;
import com.studentmanagementsys.proj.repo.StudentRepo;
import com.studentmanagementsys.proj.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

}
