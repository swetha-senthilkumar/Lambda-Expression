package com.capgemini.list2;

import java.util.Comparator;

public class EmployeeNameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	

}
