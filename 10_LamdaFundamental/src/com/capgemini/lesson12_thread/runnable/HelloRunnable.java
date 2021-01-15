package com.capgemini.lesson12_thread.runnable;

//step1:Define task
public class HelloRunnable implements Runnable {

	//step2:override run method
	@Override
	public void run() {
		
		System.out.println("Hello .. Welcome to Capgemini ..");
		
	}

}
