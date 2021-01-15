package com.capgemini.lambda5;

public class Main2 {

	public static void main(String[] args) {
		// for non static method, it is accessed by creating object
		Task t = new Task();
		// :: -> method reference operator
		// The method which is present in functional interface should have same signature(public void and its parameter)as run method
		// The method we are refering
		Runnable lambda1 = t :: doTask;
		
		Thread worker = new Thread(lambda1);
		worker.run();
	}

}
