package com.kam.beans;

public class DPD implements CourierService{
	
	static {
		System.out.println("DPD Bean class is loaded");
	}
	
	public DPD() {
		System.out.println("DPD object is created");
	}
	

	@Override
	public boolean courierService(double amnt) {
		System.out.println("Order delivered by DPD");
		return true;
	}

}
