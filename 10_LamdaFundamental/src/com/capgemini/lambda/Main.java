package com.capgemini.lambda;

public class Main {

	public static void main(String[] args) {
		Max maxfinder = new MaxFinder();
		int result = maxfinder.max(101, 90);
		System.out.println(result);
	}

}
