package com.reba.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "property")

public class Property implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "prop_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prop_id_seq")
	@SequenceGenerator(sequenceName = "prop_reba_seq", allocationSize = 1, name = "prop_id_seq")
	private int propId;

	@ManyToOne
	@JoinColumn(name = "cust_id_fk")
	private Customer customer;
	// @Column(name = "brok_id_fk")

	@ManyToOne
	@JoinColumn(name = "brok_id_fk")
	private Broker broker;
	// @Column(name = "cust_id_fk")

	@Column(name = "prop_config")
	private String propConfig;

	@Column(name = "offer_type")
	private String offerType;

	@Column(name = "offer_cost")
	private double offerCost;

	@Column(name = "area_sqft")
	private double areaSqft;

	@Column(name = "address")
	private String address;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "status")
	private boolean status;

	public int getPropId() {
		return propId;
	}

	public String getPropConfig() {
		return propConfig;
	}

	public void setPropConfig(String propConfig) {
		this.propConfig = propConfig;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public double getOfferCost() {
		return offerCost;
	}

	public void setOfferCost(double offerCost) {
		this.offerCost = offerCost;
	}

	public double getAreaSqft() {
		return areaSqft;
	}

	public void setAreaSqft(double areaSqft) {
		this.areaSqft = areaSqft;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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

