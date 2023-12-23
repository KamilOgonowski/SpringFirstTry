package com.kam.beans;

public class Pocztex implements CourierService{
	
	static {
		System.out.println("Pocztex Bean class is loaded");
	}
	
	public Pocztex() {
		System.out.println("Pocztex object is created");
	}
	

	@Override
	public boolean courierService(double amnt) {
		System.out.println("Order delivered by Pocztex");
		return true;
	}

}
