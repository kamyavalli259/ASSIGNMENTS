package com.vehicalrental;

public class Car extends Vehicle{
	double insuranceChargePerDay = 0;
	
	public Car(String vehicleNumber, String model, double ratePerDay, int days, double insuranceChargePerDay ) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insuranceChargePerDay = insuranceChargePerDay;	
	}
	
	@Override
	public double calculateRent() {
		return (ratePerDay * days) + insuranceChargePerDay ;
	}
	@Override
	public String displayDetails() {
	    return "Car [vehicleNumber=" + vehicleNumber
	            + ", model=" + model
	            + ", ratePerDay=" + ratePerDay
	            + ", days=" + days
	            + ", insuranceChargePerDay=" + insuranceChargePerDay
	            + ", totalRent=" + calculateRent()
	            + "]";
	}

}
