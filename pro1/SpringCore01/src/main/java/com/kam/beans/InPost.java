package com.kam.beans;

public class InPost implements CourierService{
	
	static {
		System.out.println("InPost Bean class is loaded");
	}

	public InPost() {
		System.out.println("InPost object is created");
	}
	
	@Override
	public boolean courierService(double amnt) {
		System.out.println("Order delivered by InPost");
		return true;
	}

}
