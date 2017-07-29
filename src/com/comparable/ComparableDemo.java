package com.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ComparableDemo{

	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Mikey", 25, 10000);
		Employee e2 = new Employee(20, "Arun", 29, 20000);
		Employee e3 = new Employee(5, "Lisa", 35, 5000);
		Employee e4 = new Employee(1, "Pankaj", 32, 50000);
		
		System.out.println("--List--");  
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4);
		System.out.println("Before Sorting : " + empList.toString());
		Collections.sort(empList);
		System.out.println("After Sorting : " + empList.toString());
	}

}
