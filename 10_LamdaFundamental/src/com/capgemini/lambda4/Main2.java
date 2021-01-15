package com.capgemini.lambda4;

public class Main2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> System.out.println("Hello..."));
        t1.start();
        
        
	}

}
