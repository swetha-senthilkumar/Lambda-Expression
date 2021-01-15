package com.capgemini.lambda2;

public class Main {

	public static void main(String[] args) {
		// Lambada Expression
		Max maxFinder = (int num1, int num2) -> { 
			if(num1 > num2)
				return num1;
			else
				return num2;
		};
		
		int result = maxFinder.max(102, 105);
		System.out.println("Result: "+result);
	}
}
