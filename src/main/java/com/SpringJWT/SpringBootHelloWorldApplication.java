package com.SpringJWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication

public class SpringBootHelloWorldApplication {
	
	
//COMMENT
	
	  @Bean public WebMvcConfigurer corsConfigurer() { return new
	  WebMvcConfigurer() { public void addCorsMapping(CorsRegistry corsRegistry) {
	  corsRegistry.addMapping("/*").allowedHeaders("*").allowedOrigins("*").
	  allowedMethods("*").allowCredentials(true); }
	  
	  
	  }; }
	 
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
	
}