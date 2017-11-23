package com.homework.Map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Translate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String, String> vocabulary = new HashMap<>();
	private String urlFile;
	private String urlTarget;
	private File fileIn;
	private File fileOut;
	
	public Translate(String urlFile, String urlTarget) {
		super();
		this.vocabulary = new HashMap<>();
		vocabulary.put("hey", "xей");
		vocabulary.put("cripple", "роздовбаний");
		vocabulary.put("creek", "річковий");
		vocabulary.put("ferry", "паром");
		vocabulary.put("butting", "проривається");
		vocabulary.put("through", "крізь");
		vocabulary.put("the", "");
		vocabulary.put("overhanging", "нависають");
		vocabulary.put("trees", "дерева");
		vocabulary.put("make", "робить");
		vocabulary.put("way", "шлях");
		vocabulary.put("for", "для");
		vocabulary.put("waters", "води");
		vocabulary.put("going", "біжать");
		vocabulary.put("down", " вниз");
		vocabulary.put("it’s", "це");
		vocabulary.put("a", "");
		vocabulary.put("mighty", "могутній");
		vocabulary.put("tight", "хват");
		vocabulary.put("squeeze", "стискає");
		vocabulary.put("all", "весь");
		vocabulary.put("alone", "на самоті");
		vocabulary.put("captain", "капітан");
		vocabulary.put("stands", "стоїть");
		vocabulary.put("hasn’t", "не");
		vocabulary.put("heard", "чує");
		vocabulary.put("from", "з");
		vocabulary.put("his", "його");
		vocabulary.put("deck", "палуби");
		vocabulary.put("hands", "руки");
		this.fileIn = new File(urlFile);
		this.fileOut = new File(urlTarget);	
	}
	
	

	public Translate() {
		super();
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

			System.out.println("|"+str+"|" + Character.isUpperCase(str.charAt(0)));
			if (vocabulary.containsKey((str.toLowerCase()))) {
				writer.write(vocabulary.get(str.toLowerCase()) + " ");
			} else {
				writer.write(str + " ");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	
	
	
	
}
