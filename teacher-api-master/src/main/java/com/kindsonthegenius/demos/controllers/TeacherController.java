package com.kindsonthegenius.demos.controllers;

import java.util.Arrays;
import java.util.List;

import com.kindsonthegenius.demos.models.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kindsonthegenius.demos.models.Teacher;
import com.kindsonthegenius.demos.services.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/teachers")
	public List<Teacher> getAll() {
		return teacherService.getAll();
	}
	
	@GetMapping("/students")
	public List<Object> getStudent() {
		Object[] students = restTemplate.getForObject("http://student-microservice/students", Object[].class);
		return Arrays.asList(students);
	}

	@PostMapping("/createOption")
	public ResponseEntity<String> createOption(@RequestBody Request request){
		System.out.println("Hello*********************");
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setBasicAuth("Jayanthi","Password");
		HttpEntity<Request> http = new HttpEntity<>(request,httpHeaders);

		return restTemplate.exchange("http://student-microservice/createOption", HttpMethod.POST,http,String.class);
//		return restTemplate.postForObject("http://student-microservice/createOption",request,String.class);
//		return restTemplate.postForEntity("http://student-microservice/createOption",request,Request.class);
	}

//	curl -u "Jayanthi_T:<xkgpbbDr6CsfNb7QLBtC>" "https://api.bitbucket.org/2.0/repositories/demorepo"
}
