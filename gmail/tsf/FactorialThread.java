package com.gmail.tsf;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
	int number;

	public FactorialThread(int number) {
		super();
		this.number = number;
	}

	public FactorialThread() {
		super();
	}
	
	private BigInteger calculatFactorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = n; i > 0; i -= 1) {
			fact = fact.multiply(new BigInteger(""+i));
		}
		return fact;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread currentThread = Thread.currentThread();
		for (int i = 1; i<=this.number; i += 1) {
			System.out.println(currentThread.getName() + " -> " + i
					+ "! = " + calculatFactorial(i));
			if (currentThread.isInterrupted()) {
				System.out.println(currentThread.getName() + " is interupted.");
			}
			return;
		}
	}
	
	
}
