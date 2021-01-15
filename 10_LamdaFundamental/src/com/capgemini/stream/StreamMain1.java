package com.capgemini.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class StreamMain1 {

	public static void main(String[] args) {
		String[] countries = {"India", "USA", "Canada", "France", "UK"};
		List< String> list = Arrays.asList(countries);
		//list.add("XYZ");
		
		for(String itr : list) {
			if(itr.length() > 4) {
				System.out.println(itr);
			}
		}
		
		System.out.println("------------------");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.length()>4)
			System.out.println(str);
		}
		
		System.out.println("--------------------------");
		Predicate<String> p = (s) -> s.length()>4;
		for(String str : list) {
			boolean f = p.test(str);
			if(f)
				System.out.println(str);
		}
	}

}
