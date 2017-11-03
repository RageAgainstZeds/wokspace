package com.gmail.tse;

import java.io.File;
import java.io.IOException;;

public class Main {
	public static void main(String[] args) {
		//Z://Courses_JAVA//scr
		// isFile()
		// exist()
		
		File in = new File("Z:/Courses_JAVA/scr/GIR.jpg");
		File out = new File("Z:/Courses_JAVA/scr/GIR_copy.jpg");
		
		try {
			FileStation.copyFile(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
