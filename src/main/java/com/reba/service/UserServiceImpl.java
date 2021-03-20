package com.reba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reba.entities.User;
import com.reba.repo.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User loginUser(int userId, String password) {
		return userRepository.loginUser(userId,password);
	}

	@Override
	public User logOutUser(int userId) {
		return userRepository.logOut(userId);
	}
	 
}
