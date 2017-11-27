package com.gmail.tskInetTech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

public class Network {
	public static String getStringFromURL(String adress) {
		StringBuilder sb = new StringBuilder();
		
		try {
			URL url = new URL(adress);
			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String text = "";
			for (;(text = br.readLine()) != null;) {
				sb.append(text);
				sb.append(System.lineSeparator());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static Map<String, List<String>> getHeader(String adress) {
		Map<String, List<String>> result = null;
		try {
			URL url = new URL(adress);
			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
			
			result = con.getHeaderFields();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
		
	}
}
