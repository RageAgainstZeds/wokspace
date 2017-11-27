package com.gmail.tskSocket;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		String adress = "https://www.youtube.com/watch?v=fi-S9lrnLZ8"; 
		String link = "Z:\\Courses_JAVA\\src\\urls.txt";
		
		InetTrue it = new InetTrue();
		System.out.println(it.checkOutAdress(adress));
		//System.out.println(it.checkOutAdress("https://prog.kiev.ua/forum/index.php"));
		it.loadFromFile(new File(link));
		
	}

}
