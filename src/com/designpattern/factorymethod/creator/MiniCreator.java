package com.designpattern.factorymethod.creator;

import com.designpattern.factorymethod.product.Car;
import com.designpattern.factorymethod.product.Mini;

public class MiniCreator extends CarCreator{

	@Override
	public Car getCar() {
		return new Mini();
	}

}
