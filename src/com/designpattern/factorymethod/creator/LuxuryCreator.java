package com.designpattern.factorymethod.creator;

import com.designpattern.factorymethod.product.Car;
import com.designpattern.factorymethod.product.Luxury;

public class LuxuryCreator extends CarCreator{

	@Override
	public Car getCar() {
		return new Luxury();
	}

}
