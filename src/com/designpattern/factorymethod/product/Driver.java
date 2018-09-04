package com.designpattern.factorymethod.product;

import com.designpattern.factorymethod.creator.CarCreator;
import com.designpattern.factorymethod.creator.LuxuryCreator;
import com.designpattern.factorymethod.creator.MiniCreator;
import com.designpattern.factorymethod.creator.SedanCreator;

public class Driver {
	public static void main(String[] args) {
		CarCreator car = createCar(CarType.LUXURY);
		car.getCar();
	}
	
	private static CarCreator createCar(CarType type) {
		switch(type) {
		case SEDAN : return new SedanCreator();
		case LUXURY : return new LuxuryCreator();
		case MINI : return new MiniCreator();
		default : throw new IllegalArgumentException();
		}
	}
}
