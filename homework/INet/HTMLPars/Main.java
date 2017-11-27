package com.homework.INet.HTMLPars;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String adress = "https://prog.kiev.ua/";
		File fileOut = new File("Z:\\Courses_JAVA\\src\\INet\\body.html");
		
		//GetTextFromURL.getStringFromURL(adress, fileOut);
		
		ParseHTML.extractHREF(fileOut);
	}

}
