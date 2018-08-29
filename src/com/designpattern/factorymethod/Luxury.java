package com.designpattern.factorymethod;

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
