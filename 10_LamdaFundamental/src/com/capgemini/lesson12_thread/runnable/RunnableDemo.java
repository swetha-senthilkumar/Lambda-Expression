package com.capgemini.lesson12_thread.runnable;

import java.util.Date;

public class RunnableDemo {
	
	
	public static void main(String[] args) {
		

		//new state( create a object of thread)
		Thread fstThread = new Thread(new MyRunnable());
		
		//runnable state while calling start method
		fstThread.start();
		
	
			
			
	
	}

}
