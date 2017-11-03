package com.gmail.tsc;

public class Thow {
	public static void main(String[] args) {
		System.out.println(calculateCircleArea(-1));
		System.out.println(calcSumm(null));
	}
	
	public static double calculateCircleArea (double r) {
		if (r < 0) {
			throw new IllegalAccessError("NegativeRadius");
		}
		else {
			return Math.PI * r * r;
		}
	}
		
		
		public static int calcSumm(int [] array) {
			if (array == null) {
			throw new IllegalAccessError("NO NULL VALUES");
		}
		int sum = 0;
		for (int element : array) {
			sum += element;	
		}
		return sum;
		
	}
	}

