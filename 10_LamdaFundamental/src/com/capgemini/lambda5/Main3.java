package com.capgemini.lambda5;

public class Main3 {

	public static void main(String[] args) {
		// calling static method
		Runnable lambda1 = Task :: doTask2;
		
		Thread worker1 = new Thread(lambda1);
		worker1.start();
	}

}
