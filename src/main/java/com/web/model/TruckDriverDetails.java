package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author user
 *
 */
@Entity
@Table(name="truck_driver_details")
public class TruckDriverDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TRUCK_DRIVER_ID")
	private Integer truckDriverId;
	
	@Column(name="TRUCK_DRIVER_NAME")
	private String truckDriverName;
	
	@Column(name="TRUCK_DRIVER_ADDRESS")
	private String truckDriverAddress;
	
	@Column(name="TRUCK_DRIVER_CONTACT")
	private String truckDriverContact;
	
	@Column(name="TRUCK_DRIVER_STATUS")
	private Boolean truckDriverStatus;

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

	public Boolean getTruckDriverStatus() {
		return truckDriverStatus;
	}

	public void setTruckDriverStatus(Boolean truckDriverStatus) {
		this.truckDriverStatus = truckDriverStatus;
	}
	

}
