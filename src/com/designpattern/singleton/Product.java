package com.designpattern.singleton;

public class Product {
	private static Product product;
	private int val;
	private Product(int val) {
		System.out.println("Creating instance with value : " + val);
		this.val = val;
	}
	
	public static Product getInstance(int val) {
		if(product == null) {
			product = new Product(val);
		} else {
			System.out.println("Instance already exist with value : " + product.val);
		}
		return product;
	}

	public void doSomething() {
		System.out.println("value is :" + val);
	}
}
