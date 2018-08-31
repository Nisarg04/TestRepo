package com.designpattern.factorymethod.product;

public class Mini extends Car {
	
	public Mini() {
		super(CarType.MINI);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("building Mini car");
	}
}
