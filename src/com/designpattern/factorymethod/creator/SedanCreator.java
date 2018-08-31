package com.designpattern.factorymethod.creator;

import com.designpattern.factorymethod.product.Car;
import com.designpattern.factorymethod.product.Sedan;

public class SedanCreator extends CarCreator{

	@Override
	public Car getCar() {
		return new Sedan();
	}

}
