package com.homework.Thread.MultiSum;

public class Summary implements Runnable{
	
	private static int sum;
	
	private int[] list = new int[10];

	public Summary() {
		super();
	}

	public int[] getList() {
		return list;
	}

	public void setList(int[] list) {
		this.list = list;
	}

	public static int getSum() {
		return sum;
	}
	
	public int summ(int index, int thredsCount) {
		int summa = 0;
		for (int i = index; i<list.length/thredsCount; i++) {
			summa += list[i];
		}
		return summa;
	}
	
	

	@Override
	public void run() {
		
		int index;
		int threadsCount;
		//summ(index, threadsCount);
		
	}
	
	
}
