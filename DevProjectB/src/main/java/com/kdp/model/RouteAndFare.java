package com.kdp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RouteAndFare {
	
	@Id
	private int routeAndFareID;
	private String pickupCity;
	private String destinationCity;
	private String swiftFare;
	private String innovaFare;
	public String getInnovaFare() {
		return innovaFare;
	}
	public void setInnovaFare(String innovaFare) {
		this.innovaFare = innovaFare;
	}
	private String suvFare;
	
	public int getRouteAndFareID() {
		return routeAndFareID;
	}
	public void setRouteAndFareID(int routeAndFareID) {
		this.routeAndFareID = routeAndFareID;
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
	public String getSwiftFare() {
		return swiftFare;
	}
	public void setSwiftFare(String swiftFare) {
		this.swiftFare = swiftFare;
	}
	
	
	public String getSuvFare() {
		return suvFare;
	}
	public void setSuvFare(String suvFare) {
		this.suvFare = suvFare;
	}

}
