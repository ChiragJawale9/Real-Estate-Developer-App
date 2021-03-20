package com.reba.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reba.entities.User;
import com.reba.pojo.UserPojo;
import com.reba.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/login/{userId}/{password}")
	public ResponseEntity<UserPojo> loginUser(@PathVariable("userId") int userId, @PathVariable("password") String password){
		User user = userService.loginUser(userId, password);
		if(user == null) {
			return new ResponseEntity("User Does Not Exist",HttpStatus.NOT_FOUND);
		}
		UserPojo userPojo = userEntityToPojo(user);
		return new ResponseEntity<UserPojo>(userPojo,HttpStatus.FOUND);
	}
	
	@GetMapping("/logout/{userId}")
	public ResponseEntity<UserPojo> logoutUser(@PathVariable("userId") int userId){
		User user = userService.logOutUser(userId);
		if(user == null) {
			return new ResponseEntity("User Does Not Exist",HttpStatus.NOT_FOUND);
		}
		UserPojo userPojo = userEntityToPojo(user);
		return new ResponseEntity<UserPojo>(userPojo,HttpStatus.FOUND);
	}
	
	private UserPojo userEntityToPojo(User user) {
		UserPojo userPojo = new UserPojo();
		userPojo.setUserId(user.getUserId());
		if(user.getCustomer() == null) {
			userPojo.setUserName(user.getBroker().getBroName());
		} else {
			userPojo.setUserName(user.getCustomer().getCustName());
		}
		userPojo.setUserPassword(user.getUserPassword());
		userPojo.setUserEmail(user.getUserEmail());
		userPojo.setUserMobile(user.getUserMobile());
		userPojo.setUserRole(user.getUserRole());
		userPojo.setUserCity(user.getUserCity());
		return userPojo;
	}
	
}
