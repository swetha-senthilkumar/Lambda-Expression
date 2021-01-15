package com.capgemini.list2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee(1001, "Swetha", 5000);
		Employee e2 = new Employee(1002, "alexa", 8000);
		Employee e3 = new Employee(1003, "balu", 10000);
		Employee e4 = new Employee(1004, "Sen", 60000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println("Before sort:");
		for(Employee emp: list) {
			System.out.println(emp);
		}
		//sorting hpns based on employee name coz comparatotTo() uses employee name
		Collections.sort(list);
		
		System.out.println("After sort:");
		for(Employee emp: list) {
			System.out.println(emp);
		}
	}
}
