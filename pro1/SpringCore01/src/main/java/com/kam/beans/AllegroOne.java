package com.kam.beans;

public class AllegroOne implements CourierService{
	
	static {
		System.out.println("AllegroOne Bean class is loaded");
	}

	
	public AllegroOne() {
		System.out.println("AllegroOne object is created");
	}
	
	@Override
	public boolean courierService(double amnt) {
		System.out.println("Order delivered by Allegro");
		return true;
	}

}
