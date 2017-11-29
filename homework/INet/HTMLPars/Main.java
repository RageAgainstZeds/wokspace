package com.homework.INet.HTMLPars;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String adress = "https://geektimes.ru/post/295893/";
		File fileBody = new File("Z:\\Courses_JAVA\\src\\INet\\body.html");
		File fileLinks = new File("Z:\\Courses_JAVA\\src\\INet\\links.txt");
		
		GetTextFromURL.getStringFromURL(adress, fileBody);
		
		ParseHTML.extractHREF(fileBody, fileLinks);
		
	}

}
