package com.reba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reba.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
