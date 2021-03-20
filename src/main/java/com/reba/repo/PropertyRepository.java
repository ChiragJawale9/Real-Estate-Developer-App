package com.reba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reba.entities.Property;
import com.reba.entities.User;

public interface PropertyRepository extends JpaRepository<Property,Integer>{

}
