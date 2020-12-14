package com.SpringJWT.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringJWT.model.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

	@GetMapping("/hello")
	public User hello(Authentication authentication) {
		System.out.println(authentication.getPrincipal());
		User user1=new User();
		user1.setName("pankaj");
		user1.setPassword("123");
		
		return user1;
	}

}
