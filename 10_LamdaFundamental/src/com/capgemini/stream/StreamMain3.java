package com.capgemini.stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMain3 {

	public static void main(String[] args) {
		String[] countries = {"India", "USA", "Canada", "France", "UK"};
		List< String> list = Arrays.asList(countries);
	
		Stream<String> s1 = list.stream();
		
		Predicate<String> predicate = (String str) -> (str.length() > 4) ? true : false;
		
		// Intermediate operation
		s1 = s1.filter(predicate);
		
		Consumer<String> c1 = (String str) -> System.out.println(str);
		
		// Terminal operations
		s1.forEach(c1);
	}

}
