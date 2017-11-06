package com.homework.Human.Exeptions;

public class IDFreeExeption extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "ID not in use ine the moment!";
	}
	
}
