package com.reba.pojo;

import java.util.Date;

public class DealPojo {
	
	private int dealId;
	
	private int custId;
	
	private int propId;
	
	private Date date;
	
	private double dealCost;

	public int getDealId() {
		return dealId;
	}

	public void setDealId(int dealId) {
		this.dealId = dealId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getPropId() {
		return propId;
	}

	public void setPropId(int propId) {
		this.propId = propId;
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
