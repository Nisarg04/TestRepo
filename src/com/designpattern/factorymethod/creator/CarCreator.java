package com.designpattern.factorymethod.creator;

import com.designpattern.factorymethod.product.Car;
import com.designpattern.factorymethod.product.CarType;

public abstract class CarCreator {
	public abstract Car getCar();

	public Car createCar() {
		System.out.println("Creating carCreator...");
		
		/*switch(carType) {
		case LUXURY : return new LuxuryCreator();
		case MINI : return new MiniCreator();
		case SEDAN : return new SedanCreator();
		default : throw new IllegalArgumentException();
		}*/
		return getCar(); 
	}
}
