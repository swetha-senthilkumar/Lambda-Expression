package com.capgemini.stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamMain2 {

	public static void main(String[] args) {
		String[] countries = {"India", "USA", "Canada", "France", "UK"};
		List< String> list = Arrays.asList(countries);
	
		Stream<String> s1 = list.stream();
		
		// Terminal operation
		//long no = s1.count();
		//System.out.println("Number of countries: "+no);
		
		Consumer<String> consumer = (str) -> System.out.println(str);
		s1.forEach(consumer);
		
	}

}
