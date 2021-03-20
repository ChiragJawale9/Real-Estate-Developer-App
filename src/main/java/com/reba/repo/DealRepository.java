package com.reba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reba.entities.Deal;

public interface DealRepository extends JpaRepository<Deal,Integer>{

}
