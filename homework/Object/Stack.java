package com.homework.Object;

import java.io.Serializable;

public class Stack implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Object[] stack = new Object[10];

	public static Object[] getStack() {
		return stack;
	}

	@Override
	public String toString() {
		return "Stack [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	public void addObject(Object object) {
		for (int i = 0; i < stack.length + 1; i++) {
			if (stack[i] == null) {
				stack[i] = object;
				System.out.println("Object was added");
				break;
			}
		}
	}
	
	public Object getObject() {
		for (int i = 0; i < stack.length + 1; i++) {
			if (stack[i] == null) {
				return stack[i-1];
			} else if (i == 9 && stack[i] != null) {
				return stack[9];
			}
		}
		return null;
	}
	
	public Object getEnDelObject() {
		for (int i = 0; i < stack.length + 1; i++) {
			Object obj;
			if (stack[i] == null) {
				if (i == 0) {
					obj = stack[0];
					stack[0] = null;
					return stack[0];
				}
				obj = stack[i-1];
				stack[i-1] = null;
				return stack[i-1];
			} else if (i == 9 && stack[i] != null) {
				obj = stack[9];
				stack[9] = null;
				return stack[9];
			}
		}
		return null;
	}
}
