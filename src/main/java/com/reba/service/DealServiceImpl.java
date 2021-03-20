package com.reba.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reba.entities.Customer;
import com.reba.entities.Deal;
import com.reba.entities.Property;
import com.reba.repo.DealRepository;

@Service("dealService")
public class DealServiceImpl implements DealService{

	@Autowired
	DealRepository dealRepo;
	
	@Override
	public Deal saveDeal(Property property, Customer customer) {
		Deal deal = new Deal();
		deal.setCustomer(customer);
		deal.setProperty(property);
		deal.setDate(new Date());
		deal.setDealCost(property.getOfferCost());
		property.setStatus(true);
		return dealRepo.saveAndFlush(deal);
	}

	@Override
	public List<Deal> fetchAllDeals() {
		return dealRepo.findAll();
	}

}
