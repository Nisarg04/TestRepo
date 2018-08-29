package com.designpattern.factorymethod;

/**
 * Class with main method in it, 
 * calls the static factory method of the factory class
 * 
 * @author nisargkumar.s.patil
 */
public class Driver {
	public static void main(String[] args) {
		Car sedan = CarFactory.buildCar(CarType.SEDAN);
		Car mini = CarFactory.buildCar(CarType.MINI);
		Car luxury = CarFactory.buildCar(CarType.LUXURY);
		
		System.out.println("SEDAN : " + sedan.getClass().getName());
		System.out.println("MINI : " + mini.getClass().getName());
		System.out.println("LUXURY : " + luxury.getClass().getName());
	}
}
