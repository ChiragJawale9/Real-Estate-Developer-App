package com.reba.pojo;

import java.util.Set;

public class CustomerPojo {
	
	private int custId;
	
	private String custName;
	
	private Set<PropertyPojo> property;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Set<PropertyPojo> getProperty() {
		return property;
	}

	public void setProperty(Set<PropertyPojo> property) {
		this.property = property;
	}
	
}
