package com.homework.File.CopyFiles;

import java.io.File;
import java.io.IOException;

import com.gmail.tse.FileStation;


public class Main {
	public static void main(String[] args) {
		MyFileFilter mFF = new MyFileFilter("txt", "csv");
		
		File outFolder = new File ("Z:\\Courses_JAVA\\src\\backUp");
		
		File folder = new File("Z:\\Courses_JAVA\\src");
		File[] fileList = folder.listFiles(mFF);
		for (File file : fileList) {
			//System.out.println(in + "\\" + file.getName() + "\n" + out + "\\" + file.getName());
			File fileOut = new File (outFolder + "\\" + file.getName());
			try {
				FileStation.copyFile(file, fileOut);
				System.out.println("Done!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}