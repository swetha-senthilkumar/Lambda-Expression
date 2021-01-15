package com.capgemini.stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMain4 {

	public static void main(String[] args) {
		String[] countries = {"India", "USA", "Canada", "France", "UK"};
		List< String> list = Arrays.asList(countries);
	
		list.stream().filter((String str) -> (str.length() > 4)).forEach((str) -> System.out.println(str));
	}

}
