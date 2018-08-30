package com.designpattern.simplefactory;

/**
 * Super class, for factory method implementation
 * this can be an interface or normal concrete class.
 * 
 * Main aim is to create an instance of any class that implements/extends 
 * this interface/class, in our case "Sedan, Mini or Luxury"
 * 
 * @author nisargkumar.s.patil
 * 
 */
public abstract class Car {
	public abstract void construct();

	private CarType carType;

	public Car(CarType carType) {
		this.carType = carType;
		arrangeParts();
	}

	private void arrangeParts() {
		//Arrange one time processing here
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}
}
