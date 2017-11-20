package com.homework.Object;

public class Main {

	public static void main(String[] args) throws NullPointerException, StackIsFullExeption {
		// TODO Auto-generated method stub
		Stack stk = new Stack();
		for (int i = 0; i < 5; i++) {
			stk.addObject(new String("HEY JOE! - " + i));
			System.out.println(stk.getObject());
		}
		for (int i = 0; i < 5; i++) {
			stk.addObject(new Double(10.123+i));
			System.out.println(stk.getObject());
		}
		
		
		for (int i = 0; i < 10; i++) {
			stk.getEnDelObject();
			System.out.println(stk.getObject());
		}
		System.out.println(stk.getObject());
		
		
	}

}
