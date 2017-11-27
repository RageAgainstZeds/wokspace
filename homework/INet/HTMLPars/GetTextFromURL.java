package com.homework.INet.HTMLPars;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class GetTextFromURL {
	private String url;
	private File fileOut;
	
	public GetTextFromURL(String url, String str) {
		super();
		this.url = url;
		this.fileOut = new File(str);
	}
	
	
	public GetTextFromURL(File fileOut) {
		super();
		this.fileOut = fileOut;
	}


	public GetTextFromURL() {
		super();
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public File getFileOut() {
		return fileOut;
	}
	public void setFileOut(File fileOut) {
		this.fileOut = fileOut;
	}

	public static void getStringFromURL(String adress, File fileOut) {
		StringBuilder sb = new StringBuilder();
		try (FileWriter writer = new FileWriter(fileOut)) {
			writer.write("");
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		try {
			FileWriter fw = new FileWriter(fileOut, true);
			try {
				URL url = new URL(adress);
				HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String str = "";
				while((str=br.readLine())!= null) {
					fw.write(str);
					fw.write(System.lineSeparator());
				}
				fw.flush();
				fw.close();
				System.out.println("File succefully wrote!");
				
			} catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
