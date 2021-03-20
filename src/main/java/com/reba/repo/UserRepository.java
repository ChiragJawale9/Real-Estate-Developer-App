package com.reba.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reba.entities.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Integer>{
	
	@Query("SELECT u FROM User WHERE u.userId = ?1 AND u.userPassword = ?2")
	public User loginUser(User user);
	
	@Query("SELECT u FROM User WHERE u.userId = ?1")
	public User logOut(User user);
	
}
