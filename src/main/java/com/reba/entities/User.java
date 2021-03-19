package com.reba.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_reba")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//Using a sequence to generate user IDs
	//This user ID mapped to either Customer or Broker ID
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
	@SequenceGenerator(sequenceName = "user_reba_seq", allocationSize = 1, name = "user_id_seq")
	private int userId;
	
	@Column(name = "user_password")
	private String userPassword;
	
	@Column(name = "user_role")
	private String userRole;
	
	@Column(name = "user_mobile")
	private String userMobile;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_city")
	private String userCity;
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	private Customer customer;
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	private Broker broker;

	//Creating getters and setters to access different fields
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Broker getBroker() {
		return broker;
	}

	public void setBroker(Broker broker) {
		this.broker = broker;
	}
	
}
