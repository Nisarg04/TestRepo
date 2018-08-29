package com.designpattern.factorymethod;

/**
 *	Factory class that returns instance of any sub-class of Car
 *
 * New instance is created based on the enum type that is passed
 * This parameter is just to distinguish between the subclasses
 * Basic version can have String as this parameter
 * 
 * @author nisargkumar.s.patil
 */
public class CarFactory {

	public static Car buildCar(CarType carType) {
		switch(carType) {
			case SEDAN : return new Sedan();
			case LUXURY : return new Luxury();
			default : return new Mini();
		}
	}
}
