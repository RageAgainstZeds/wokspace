package com.homework.Human.Exeptions;

public class IDExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "ID not exist!";
	}
		
}
