package com.homework.File.MergeWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Iterator;
import com.homework.File.CopyFiles.MyFileFilter;

public class Main {
	public static void main(String[] args) {
		
		List<String> matchList = new ArrayList<>();
		
		MyFileFilter mFF = new MyFileFilter("txt");
		File srcFolder = new File("Z:\\\\Courses_JAVA\\\\src");
		File fileMatches = new File("Z:\\Courses_JAVA\\src\\backUp\\txtMatches.txt");
		File[] fileList = srcFolder.listFiles(mFF);
		
		List<String> txtOne = new ArrayList<>();
		List<String> txtTwo = new ArrayList<>();
		
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
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
	}
}
