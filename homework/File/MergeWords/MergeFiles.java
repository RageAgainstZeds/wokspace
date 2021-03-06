package com.homework.File.MergeWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeFiles {
	
	private List<String> matchList = new ArrayList<>();
	private File fileMatches;
	private List<String> txtOne = new ArrayList<>();
	private List<String> txtTwo = new ArrayList<>();
	private File[] fileList = new File[2];
	
	public MergeFiles(String fileOne, String fileTwo, String fileMatches) {
		super();
		this.fileMatches = new File(fileMatches);
		this.fileList[0] = new File(fileOne);
		this.fileList[1] = new File(fileTwo);
	}
	public MergeFiles() {
		super();
	}
		
	public File getFileMatches() {
		return fileMatches;
	}
	public void setFileMatches(File fileMatches) {
		this.fileMatches = fileMatches;
	}
	
	
	public void readFiles() {
		for (File file : fileList) {
			try (BufferedReader fileIn = new BufferedReader(new FileReader(file))) {
	            //reading lines from a file and parse it
	            String str;
	            while ((str = fileIn.readLine()) != null) {
	            	for (String retval : str.split(" ")) {
	            		if (file.getName().equals(fileList[0].getName())) {
	            			txtOne.add(retval);
	            		} else if (file.getName().equals(fileList[1].getName())) {
	            			txtTwo.add(retval);
	            		}
    	            }
            	}
            } catch (IOException ex) {
	            ex.getMessage();
	        }
		}
	}
	
	public void writeWords() {
		//get the repeated words from two lists
				for (int i = 0; i < txtOne.size(); i++) {
					if (txtTwo.contains(txtOne.get(i))) {
						matchList.add(txtOne.get(i));
					}
				}
				//get only distinct words
				matchList = matchList.stream().distinct().collect(Collectors.toList());
				//File Writer
		        try(FileWriter fileOut = new FileWriter(fileMatches)) {
		            //write final list into the file
		            Iterator<String> iter = matchList.iterator();
		            while (iter.hasNext()) {
		                String txt = (String) iter.next();
		                fileOut.write(txt + " ");
		            }
		            fileOut.flush();
		            fileOut.close();
		            System.out.println("File Write Successfully!");
		        }
		        catch (IOException ex) {
		            System.out.println(ex.getMessage());
		        }
	}
}
