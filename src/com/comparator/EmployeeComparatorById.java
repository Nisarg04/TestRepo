package com.comparator;

import java.util.Comparator;

public class EmployeeComparatorById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId() - o1.getId();
	}
	
}
