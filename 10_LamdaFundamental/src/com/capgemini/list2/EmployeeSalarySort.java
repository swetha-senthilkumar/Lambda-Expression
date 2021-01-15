package com.capgemini.list2;

import java.util.Comparator;

public class EmployeeSalarySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmployeeSalary() > o2.getEmployeeSalary()) {
			return 1;
		}else
		return -1;
	}
	
}
