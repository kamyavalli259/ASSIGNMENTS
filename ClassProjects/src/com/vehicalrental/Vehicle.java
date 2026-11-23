package com.vehicalrental;

public class Vehicle {
	String vehicleNumber;
	String model;
	double ratePerDay;
	int days;
	
	
	public Vehicle(String vehicleNumber, String model, double ratePerDay, int days) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}
	

	public double calculateRent() {
		return ratePerDay * days;
	}


	public String displayDetails() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", model=" + model + ", ratePerDay=" + ratePerDay + ", days="
				+ days + "]";
	}
	
	
	//Car  | KA01AB1234 | Swift  | Days: 3 | Rent: 5100.0

	
}
