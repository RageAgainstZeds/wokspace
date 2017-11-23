package com.homework.Map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Translate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Map<String, String> vocabulary;
	private String urlFile;
	private String urlTarget;
	private File fileIn;
	private File fileOut;
	
	public Translate(String urlFile, String urlTarget) {
		super();
		Translate.vocabulary = new HashMap<>();
		this.fileIn = new File(urlFile);
		this.fileOut = new File(urlTarget);
		FillVocabulary.fillMapDefault();
	}
	
	

	public Translate() {
		super();
	}


	
	public void setVocabulary(String str1, String str2) {
		Translate.vocabulary.put(str1, str2);
	}


	public String getUrlFile() {
		return urlFile;
	}

	public void setUrlFile(String urlFile) {
		this.urlFile = urlFile;
	}

	public String getUrlTarget() {
		return urlTarget;
	}

	public void setUrlTarget(String urlTarget) {
		this.urlTarget = urlTarget;
	}

	public Map<String, String> getVocabulary() {
		return vocabulary;
	}

	public File getFileIn() {
		return fileIn;
	}

	public File getFileOut() {
		return fileOut;
	}
	
	
	public void readFile() {
		File file = this.fileIn;
		try (FileWriter writer = new FileWriter(this.fileOut)) {
			writer.write("");
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		try (BufferedReader read = new BufferedReader(new FileReader(file))) {
			String line;
			while((line = read.readLine()) != null) {
				for (String sepLine : line.split("[ ,.]")) {
					//put here a write method
					if (sepLine == null || sepLine.equals("")) {}
					else {
						translateAnWrite(sepLine);
					}
				}
			}
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public void translateAnWrite(String str) {
		try(FileWriter writer = new FileWriter(this.fileOut, true)) {
			if (vocabulary.containsKey((str.toLowerCase()))) {
				writer.write(Translate.vocabulary.get(str.toLowerCase()) + " ");
			} else {
				writer.write(str + " ");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public void saveVocabulary(String link) throws IOException {
		  FileOutputStream fos = new FileOutputStream(link);
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  oos.writeObject(Translate.vocabulary);
		  oos.flush();
		  oos.close();
		}
	
	
	
	
	
}
