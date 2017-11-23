package com.homework.Map;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Translate trans = new Translate("Z:\\Courses_JAVA\\src\\lyrics.txt", "Z:\\Courses_JAVA\\src\\lyricsTranslated.txt");
		trans.readFile();

	}

}
