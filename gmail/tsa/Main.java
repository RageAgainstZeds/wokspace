package com.gmail.tsa;

public class Main {
	public static void main(String[] args) {
		/*
		Car m1 = new Car("Red", 1500, 1999);
	
		
		Car mk2 = new Car("Blue", 2111, 2001); 
				
		System.out.println(mk2);
		System.out.println(m1);
		*/
		int n = 2;
		for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if (j==i) {
                System.out.println(n);
                }
                else {System.out.print(n);}
            }
            }
	}
	
}