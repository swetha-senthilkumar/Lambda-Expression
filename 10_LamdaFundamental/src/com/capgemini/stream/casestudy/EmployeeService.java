package com.capgemini.stream.casestudy;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
	private EmployeeRepository repository = new EmployeeRepository();
	
	public double sumAllEmployeeSalary() {
		//lambda exp
		//Stream<Employee> stream = repository.getEmployees().stream();
		Stream<Employee> stream = repository.getEmployees().stream();
		double totalSal = stream.collect(Collectors.summingDouble(Employee -> Employee.getSalary()));
		return totalSal;
	}
}
