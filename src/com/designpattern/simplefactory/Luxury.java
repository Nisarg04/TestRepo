package com.designpattern.simplefactory;

public class Luxury extends Car {

	public Luxury() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("building Luxury car");
	}

}
