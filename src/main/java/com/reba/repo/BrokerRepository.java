package com.reba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reba.entities.Broker;
import com.reba.entities.User;

public interface BrokerRepository extends JpaRepository<Broker,Integer>{

}
