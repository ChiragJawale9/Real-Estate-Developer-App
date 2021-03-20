package com.reba.pojo;

import java.util.Set;

public class BrokerPojo {
	
	private int broId;
	
	private String broName;
	
	private Set<PropertyPojo> property;

	public int getBroId() {
		return broId;
	}

	public void setBroId(int broId) {
		this.broId = broId;
	}

	public String getBroName() {
		return broName;
	}

	public void setBroName(String broName) {
		this.broName = broName;
	}

	public Set<PropertyPojo> getProperty() {
		return property;
	}

	public void setProperty(Set<PropertyPojo> property) {
		this.property = property;
	}
	
}
