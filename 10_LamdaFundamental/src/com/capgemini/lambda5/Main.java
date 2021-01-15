package com.capgemini.lambda5;

public class Main {

	public static void main(String[] args) {
	    // public void run()
		Runnable lambda1 = () -> {
			for(int i=1; i<=5; i++) {
	    		System.out.println("i= "+i);
	    	}
		}; 	
		
		Thread worker1 = new Thread(lambda1);
		worker1.start();
	}
}
