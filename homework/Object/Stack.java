package com.homework.Object;

import java.io.Serializable;

public class Stack implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Object[] stack = new Object[10];
	private static int top = 0;

	public static Object[] getStack() {
		return stack;
	}
	

	public static int getTop() {
		return top;
	}


	@Override
	public String toString() {
		return "Stack [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	public void addObject(Object object) throws NullPointerException, StackIsFullExeption {
		if (object == null) {
			throw new NullPointerException();
		} else if (top > stack.length) {
			throw new StackIsFullExeption();
		}
		else {
			stack[top] = object;
			Stack.top += 1;
			//System.out.println("Object added!");
			//System.out.println("Top is - " + top);
			
		}
	}
	
	public Object getObject() {
		if (top == 0) {
			System.out.println("Stack is empty!");
		} else {
			return stack[top-1];
		}
		return null;
	}
	
	public Object getEnDelObject() {
		Object obj;
		if (top == 0) {
			System.out.println("Stack is empty!");
		} else {
			
			obj = stack[top-1];
			stack[top-1] = null;
			Stack.top -= 1;
			return obj;
		}
		return null;
	}
}
