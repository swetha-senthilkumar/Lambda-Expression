package com.capgemini.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain5 {

	public static void main(String[] args) {
		String[] countries = {"India", "USA", "Canada", "France", "UK"};
		List< String> list = Arrays.asList(countries);
	
		Set<String> result = list.stream().filter((String str) -> (str.length() > 4)).collect(Collectors.toSet());
	    result.stream().forEach(str -> System.out.println(str));
	}

}
