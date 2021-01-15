package com.capgemini.lambda3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		Employee e1 = new Employee(1001, "Swetha", 5000);
		Employee e2 = new Employee(1002, "alexa", 800);
		Employee e3 = new Employee(1003, "balu", 1000);
		Employee e4 = new Employee(1004, "Sen", 60000);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		System.out.println("Before sort:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		// Lambda Expression
		Comparator<Employee> salarySortLambda = (emp1, emp2) -> (emp1.getEmployeeSalary() > emp2.getEmployeeSalary()) ? 1 : -1;
		
		Collections.sort(list, salarySortLambda);
		
		System.out.println("After sort by salary:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		// Lambda Expression - sort by name
		Collections.sort(list, (emp1,emp2) -> emp1.compareTo(emp2));
		
		System.out.println("After sort by name:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}
}
