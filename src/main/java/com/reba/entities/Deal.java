package com.reba.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "deal")
public class Deal {

	@Id
	@Column(name = "deal_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deal_id_seq")
	@SequenceGenerator(sequenceName = "deal_reba_seq", allocationSize = 1, name = "deal_id_seq")
	private int dealId;

	@OneToOne
	@JoinColumn(name = "cust_id_fk")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name = "prop_id_fk")
	private Property property;
	
	@Column(name = "deal_date")
	private Date date;
	
	@Column(name = "deal_cost")
	private double dealCost;

	public int getDealId() {
		return dealId;
	}

	public void setDealId(int dealId) {
		this.dealId = dealId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getDealCost() {
		return dealCost;
	}

	public void setDealCost(double dealCost) {
		this.dealCost = dealCost;
	}
}
