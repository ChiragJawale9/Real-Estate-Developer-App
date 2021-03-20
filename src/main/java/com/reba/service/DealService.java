package com.reba.service;

import java.util.List;

import com.reba.entities.Customer;
import com.reba.entities.Deal;
import com.reba.entities.Property;

public interface DealService {
	
	public Deal saveDeal(Property property,Customer customer);
	
	public List<Deal> fetchAllDeals();
	
}
