package com.capgemini.lesson12_thread.runnable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {//Running state when excuting a run method
		

		System.out.println("Thread start:::"+Thread.currentThread().getName());
        
		
        for(int row=2;row<5;row++){
			for(int num=1;num<=10;num++)
				System.out.print(row*num+" ");
			
			System.out.println("");
		}
		
		
		
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
		
	}

}
