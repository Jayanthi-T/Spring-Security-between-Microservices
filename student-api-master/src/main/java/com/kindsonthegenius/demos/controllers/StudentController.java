package com.kindsonthegenius.demos.controllers;

import java.util.List;

import com.kindsonthegenius.demos.models.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kindsonthegenius.demos.models.Student;
import com.kindsonthegenius.demos.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/students")
	public List<Student> getAll() {		
		return studentService.getAll();		
	}

	@PostMapping("/createOption")
	public String createOption(@RequestBody Request req){
		String response;
		switch (req.getOption()){
			case 1:
				response = "Option 1 requested";
				break;
			case 2:
				response = "Option 2 requested";
				break;
			case 3:
				response = "Option 3 requested";
				break;
			default:
				response = "Invalid request";
				break;
		}
		return response;
	}


}
