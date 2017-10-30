package com.homework.Human.Exeptions;

public class ClassExeption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Class is full! Sorry.";
	}
	
	
}
