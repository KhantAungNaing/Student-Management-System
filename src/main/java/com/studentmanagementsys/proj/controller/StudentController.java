package com.studentmanagementsys.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.studentmanagementsys.proj.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/students";
	}

	@GetMapping("/students")
	public String listStudents(ModelMap model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "views/students";
	}

}
