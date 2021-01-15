package com.capgemini.lambda2;

import java.lang.System;
public class Main3 {

	public static void main(String[] args) {
		// Lambda Expression
	    Max objMax = (n1, n2) -> (n1 > n2) ? n1 : n2;	
	
	//System.out.println("Result: "+objMax.max(105, 102));
	System.out.println(objMax.max(102, 105));
	System.out.println(objMax.max(102, 102));
	}
}
