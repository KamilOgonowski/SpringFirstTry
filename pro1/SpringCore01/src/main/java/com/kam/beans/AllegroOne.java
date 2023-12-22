package com.kam.beans;

public class AllegroOne implements CourierService{

	@Override
	public boolean courierService(double amnt) {
		System.out.println("Order delivered by Allegro");
		return false;
	}

}
