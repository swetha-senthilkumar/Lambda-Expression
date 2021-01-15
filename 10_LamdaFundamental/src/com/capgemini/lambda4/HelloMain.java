package com.capgemini.lambda4;

public class HelloMain {

	public static void main(String[] args) {
		
        //step 3 : creating object for task
	    HelloRunnable hello = new HelloRunnable();
		
	    //step 4: creating worker thread
	    Thread helloThread = new Thread(hello);//hello is the task to be performed
	
	    //step 5: starting the worker thread
		helloThread.start();
	
	}

}
