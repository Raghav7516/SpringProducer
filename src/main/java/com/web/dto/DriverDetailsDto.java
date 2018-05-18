package com.web.dto;

import javax.validation.constraints.NotNull;

public class DriverDetailsDto {
	
	private Integer truckDriverId;
	
	@NotNull(message="Driver name can not be empty")
	private String truckDriverName;
	
	@NotNull(message="Driver address can not be empty")
	private String truckDriverAddress;
	
	@NotNull(message="driver contact can not be empty")
	private String truckDriverContact;
	
	public Integer getTruckDriverId() {
		return truckDriverId;
	}

	public void setTruckDriverId(Integer truckDriverId) {
		this.truckDriverId = truckDriverId;
	}

	public String getTruckDriverName() {
		return truckDriverName;
	}

	public void setTruckDriverName(String truckDriverName) {
		this.truckDriverName = truckDriverName;
	}

	public String getTruckDriverAddress() {
		return truckDriverAddress;
	}

	public void setTruckDriverAddress(String truckDriverAddress) {
		this.truckDriverAddress = truckDriverAddress;
	}

	public String getTruckDriverContact() {
		return truckDriverContact;
	}

	public void setTruckDriverContact(String truckDriverContact) {
		this.truckDriverContact = truckDriverContact;
	}
	
	

}
