package com.homework.Thread.First;

import java.util.ArrayList;
import java.util.List;

public class FactorialStart {
	
	int factorialCount;
	//private List<FactorialCalc> factorialList = new ArrayList<>();
	
	private List<Thread> threadList = new ArrayList<>();
	
	public FactorialStart(int factorialCount) {
		super();
		this.factorialCount = factorialCount;
	}
	

	public FactorialStart() {
		super();
	}

	public int getFactorialCount() {
		return factorialCount;
	}

	public void setFactorialCount(int factorialCount) {
		this.factorialCount = factorialCount;
	}
	
	public void startFactorials() {
		for (int i = 0; i <= factorialCount; i++) {
			threadList.add(new Thread(new FactorialCalc(i)));
		}
		
		for (Thread threadObj : threadList) {
			threadObj.start();
			try {
				threadObj.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
