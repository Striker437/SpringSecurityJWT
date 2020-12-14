package com.SpringJWT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJWT.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByName(String name);

}
