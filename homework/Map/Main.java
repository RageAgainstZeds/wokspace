package com.homework.Map;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Translate trans = new Translate("Z:\\Courses_JAVA\\src\\English.in", 
										"Z:\\Courses_JAVA\\src\\Ukrainian.out");
		trans.readFile();
		
		trans.saveVocabulary("Z:\\Courses_JAVA\\src\\vocabulary.out");

	}

}
