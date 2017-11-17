package com.homework.Object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk = new Stack();
		for (int i = 0; i < 5; i++) {
			stk.addObject(new String("HEY JOE!"));
		}
		for (int i = 0; i < 5; i++) {
			stk.addObject(new Double(10.123+i));
		}
		
		for (int i = 0; i < 9; i++) {
			stk.getEnDelObject();
			System.out.println(stk.getObject());
		}
		
		
		
	}

}
