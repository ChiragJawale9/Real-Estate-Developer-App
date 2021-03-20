package com.reba.service;

import com.reba.entities.User;

public interface UserService {
	
	public User loginUser(int userId, String password);
	
	public User logOutUser(int userId);
	
}
