package com.gmail.tsf;



public class Main {
	public static void main(String[] args) {
		FactorialThread factOne = new FactorialThread(10);
		FactorialThread factTwo = new FactorialThread(10);
		//FactorialThread factThree = new FactorialThread(10000);
		
		Thread thOne = new Thread(factOne);
		Thread thTwo = new Thread(factTwo);
		//Thread thThree = new Thread(factThree);
		
	/*	thOne.setDaemon(true);
		thTwo.setDaemon(true);*/
		
		thOne.start();
		thTwo.start();
		//thThree.start();
		
		
/*		try {			
 		thOne.join(); //stops flow where it called until flow for what it called is done
			thTwo.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		thOne.interrupt();
		thTwo.interrupt();
		
		Thread th = Thread.currentThread();
		
		System.out.println(th.getName() + " is STOP!!");
	}
}
