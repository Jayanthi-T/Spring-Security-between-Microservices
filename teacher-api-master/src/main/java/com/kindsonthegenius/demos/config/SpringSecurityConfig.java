//package com.kindsonthegenius.demos.config;
//
//import com.kindsonthegenius.demos.services.TeacherService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//@SuppressWarnings("deprecation")
//@Configuration
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.inMemoryAuthentication().withUser("Jayanthi").password("Password").roles("ADMIN");
////	}
////
//////	 security for all API
////
////	  @Override
////	  protected void configure(HttpSecurity http) throws Exception {
////	  http.csrf().disable();
////	  http.authorizeRequests().anyRequest().fullyAuthenticated().and().
////	  httpBasic(); }
//
//	private final TeacherService teacherService;
//
//	@Autowired
//	public SpringSecurityConfig(TeacherService teacherService) {
//		this.teacherService = teacherService;
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.cors().and().csrf().disable().authorizeRequests()
//				.antMatchers(HttpMethod.POST,"/createOption").permitAll()
//				.and().httpBasic();
//	}
//
//	@Bean
//	public static NoOpPasswordEncoder passwordEncoder() {
//		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//	}
//}
