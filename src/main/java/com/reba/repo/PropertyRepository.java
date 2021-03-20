package com.reba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reba.entities.Property;

public interface PropertyRepository extends JpaRepository<Property,Integer>{

}
