package com.reba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reba.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
