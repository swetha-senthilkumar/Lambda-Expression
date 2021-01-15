package com.capgemini.stream2;

import java.util.Arrays;
import java.util.List;

public class Mapping {

	public static void main(String[] args) {
		
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		System.out.println("Word legnth for locations:");
		
		//locations.stream().map(String::length).forEach(System.out::print);
		
		locations.stream().map((String str) -> str.length()).forEach((str) -> System.out.println(str));
	}
}
