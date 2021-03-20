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
@Table(name = "broker")
public class Broker implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "bro_id")
	private User user;
	
	@Column(name = "bro_name")
	private String broName;

	@OneToMany(mappedBy = "broker")
	private Set<Property> properties = new HashSet<>();

        //Creating getters and setters to access different fields

	public String getBroName() {
		return broName;
	}

	public void setBroName(String broName) {
		this.broName = broName;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Set<Property> getProperties(){
		return this.properties;
	}
	
	public void addProperty(Property property) {
		property.setBroker(this);
		this.getProperties().add(property);
	}
}
