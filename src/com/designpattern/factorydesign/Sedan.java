package com.designpattern.factorydesign;

public class Sedan extends Car {

	public Sedan() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("building Sedan car");
	}

}
