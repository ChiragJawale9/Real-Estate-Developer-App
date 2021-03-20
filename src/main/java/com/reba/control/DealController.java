package com.reba.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reba.entities.Customer;
import com.reba.entities.Deal;
import com.reba.entities.Property;
import com.reba.entities.User;
import com.reba.pojo.DealPojo;
import com.reba.service.DealService;

@RestController
@RequestMapping("/deals")
public class DealController {

	@Autowired
	DealService dealService;
	
	//Cannot understand how to pass the objects here
	
	@PostMapping("/addDeal/{propId}/{custId}")
	public ResponseEntity<DealPojo> saveDeal(@PathVariable("propId") int propId,@PathVariable("custId") int custId){
		Property property = new Property();
		property.setPropId(propId);
		User user = new User();
		user.setUserId(custId);
		Customer customer = new Customer();
		customer.setUser(user);
		Deal deal = dealService.saveDeal(property, customer);
		if(deal == null) {
			return new ResponseEntity("Deal could not be made",HttpStatus.CONFLICT);
		}
		DealPojo dealPojo = dealEntityToPojo(deal);
		return new ResponseEntity<DealPojo>(dealPojo,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getDeals")
	public ResponseEntity<List<DealPojo>> fetchAllDeals(){
		List<Deal> deals = dealService.fetchAllDeals();
		
		if(deals == null) {
			return new ResponseEntity("No deals found",HttpStatus.NOT_FOUND);
		}
		
		List<DealPojo> dealPojos = new ArrayList<>();
		for(Deal eDeal : deals) {
			dealPojos.add(dealEntityToPojo(eDeal));
		}
		return new ResponseEntity<List<DealPojo>>(dealPojos,HttpStatus.FOUND);
	}
	
	private DealPojo dealEntityToPojo(Deal deal) {
		DealPojo dealPojo = new DealPojo();
		dealPojo.setDealId(deal.getDealId());
		dealPojo.setCustId(deal.getCustomer().getCustId());
		dealPojo.setPropId(deal.getProperty().getPropId());
		dealPojo.setDate(deal.getDate());
		dealPojo.setDealCost(deal.getDealCost());
		return dealPojo;
	}
}
