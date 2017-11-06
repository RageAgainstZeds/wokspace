package com.homework.File.MergeWords;

public class Main {
	public static void main(String[] args) {

		MergeFiles mergeFiles = new MergeFiles("Z:\\Courses_JAVA\\src\\txtOne.txt",
												"Z:\\Courses_JAVA\\src\\txtTwo.txt",
												"Z:\\Courses_JAVA\\src\\backUp\\txtMatches.txt");
		
		mergeFiles.readFiles();
		mergeFiles.writeWords();
		
	}	
}
