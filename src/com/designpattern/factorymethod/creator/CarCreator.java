package com.designpattern.factorymethod.creator;

import com.designpattern.factorymethod.product.Car;

/**
 * This is abstract creator.
 * getCar() has to be implemented by all its sub-classes
 * @author nisargkumar.s.patil
 *
 */
public abstract class CarCreator {

	//Factory method
	public abstract Car getCar();

	public Car createCar() {
		//car is an instance returned by any of the subclasses
		Car car = getCar();

		//perform some other operations on car
		//performing additional operations is not mandatory
		car.construct();

		return car; 
	}
}
