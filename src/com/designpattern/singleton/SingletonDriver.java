package com.designpattern.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		Product pdt = Product.getInstance(3);
//		pdt = Product.getInstance(4);
//		pdt = Product.getInstance(5);
		pdt.doSomething();
	}

}
