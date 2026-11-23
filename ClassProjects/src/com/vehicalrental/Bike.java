package com.vehicalrental;

public class Bike extends Vehicle{
	private double discountAmount = 0;
	private double totalRent = 0;
	
	public Bike(String vehicleNumber, String model, double ratePerDay, int days, double discount ) {
		super(vehicleNumber, model, ratePerDay, days);
		this.discountAmount = discount;	
	}
	
	@Override
	public double calculateRent() {
		totalRent = ratePerDay * days;
	    discountAmount = totalRent * (discountAmount / 100);
	    return totalRent - discountAmount;
	}
	
	@Override
	public String displayDetails() {
	    return "Car [vehicleNumber=" + vehicleNumber
	            + ", model=" + model
	            + ", ratePerDay=" + ratePerDay
	            + ", days=" + days
	            + ", DiscountAmount=" + discountAmount
	            + ", totalRent=" + calculateRent()
	            + "]";
	}


}
