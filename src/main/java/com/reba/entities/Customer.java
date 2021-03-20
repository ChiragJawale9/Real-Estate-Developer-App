package com.reba.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "cust_id")
	private User user;
	
	@Column(name = "cust_name")
	private String custName;
	
	@OneToMany(mappedBy = "customer")
	private Set<Property> properties = new HashSet<>();
	
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Set<Property> getProperties(){
		return this.properties;
	}
	
	public void addProperty(Property property) {
		property.setCustomer(this);
		this.getProperties().add(property);
	}
}