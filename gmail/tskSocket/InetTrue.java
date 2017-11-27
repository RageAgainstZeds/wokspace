package com.gmail.tskSocket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

public class InetTrue {
	private Map<String, String> result = new HashMap<>();
	
	public String checkOutAdress(String adress) {
		try {
			URL url = new URL(adress);
			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
			
			return "" + con.getResponseCode() + "--> " + con.getResponseMessage();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	public void loadFromFile(File file) {
		String text = null;
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (;(text = br.readLine()) != null;) {
				 this.result.put(text, checkOutAdress(text));
				 //System.out.println(text);
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		returnCheckresult();
	}
	
	public void returnCheckresult() {
		Set<String> keySet = this.result.keySet();
		for (String string : keySet) {
			//result.put(string, result.get(string));
			System.out.println(string + " --> " + result.get(string));
		}
		
		
	}
}
