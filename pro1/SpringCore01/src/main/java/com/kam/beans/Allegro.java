package com.kam.beans;

public class Allegro{ 
	
	static {
		System.out.println("Allegro class is loaded");
	}
	
	public Allegro() {
		System.out.println("Allegro object is created");
	}
	
	public Allegro(CourierService service) {
		this.service = service;
	}
	
	private CourierService service;
	
	public void setService(CourierService service) {
		this.service = service;
	}
	
	public boolean initiateDelivery(double amount) {
		return service.courierService(amount);
	}

}
