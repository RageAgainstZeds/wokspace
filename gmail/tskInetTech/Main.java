package com.gmail.tskInetTech;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		String adress = "https://prog.kiev.ua/forum/index.php";
		
		//get HTML from page
		//String text = Network.getStringFromURL(adress);
		//System.out.println(text);
		
		Map<String, List<String>> result = Network.getHeader(adress);
		Set<String> set = result.keySet();
		for (String key : set) {
			System.out.println(key +  " --->> " + result.get(key));
		}
		
	}
}
