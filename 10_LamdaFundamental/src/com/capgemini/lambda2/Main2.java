package com.capgemini.lambda2;

public class Main2 {

	public static void main(String[] args) {
		// since two parameters have same data type no need to mention
		Max maxObj = (num1, num2) -> {
			return (num1 > num2) ? num1 : num2;
		};
		
		System.out.println(maxObj.max(102, 105));
	}
}
