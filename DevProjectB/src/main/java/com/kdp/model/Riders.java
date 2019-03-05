package com.kdp.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Riders {
	
	@Id
	private String phoneNo;
	private String pickupCity;
	private String destinationCity;
	private String fare;
	private String address;
	private String date;
	private String status;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
		
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPickupCity() {
		return pickupCity;
	}
	public void setPickupCity(String pickupCity) {
		this.pickupCity = pickupCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
