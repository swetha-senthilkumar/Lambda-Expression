package com.capgemini.lambda4;

public class Main {

	public static void main(String[] args) {
		
		
		Runnable r = () -> System.out.println("Hello.. Welcome to Capgemini");
	    
		//worker thread
		Thread t1 = new Thread(r);
		t1.start();
	}

}

