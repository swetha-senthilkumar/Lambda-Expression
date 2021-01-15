package com.capgemini.lambda;

public class MaxFinder implements Max{

	@Override
	public int max(int num1, int num2) {
		if(num1 > num2) 
			return num1;
		else
			return num2;
	}
	
}
