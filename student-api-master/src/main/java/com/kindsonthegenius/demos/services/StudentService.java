package com.kindsonthegenius.demos.services;

import java.util.List;

import com.kindsonthegenius.demos.models.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.demos.models.Student;
import com.kindsonthegenius.demos.repositories.StudentRepository;
@Component
//@Service
public class StudentService implements UserDetailsService{
//implements UserDetailsService
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAll() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		return new User("Jayanthi","Password", AuthorityUtils.createAuthorityList("USER"));
	}
}
