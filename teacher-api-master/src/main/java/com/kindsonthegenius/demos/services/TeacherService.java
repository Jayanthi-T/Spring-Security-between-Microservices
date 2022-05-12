package com.kindsonthegenius.demos.services;

import com.kindsonthegenius.demos.models.Teacher;
import com.kindsonthegenius.demos.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	public List<Teacher> getAll() {
		return (List<Teacher>) teacherRepository.findAll();
	}

//	@Override
//	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//		return new User("Jaya","Pass", AuthorityUtils.createAuthorityList("USER"));
//	}
}
