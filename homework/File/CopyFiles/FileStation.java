package com.homework.File.CopyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileStation {
	
	public static void copyFile(File in, File out) throws IOException {
		if (in == null || out == null) {
			throw new IllegalAccessError("NULL file pointer.");
		}
		
		try(InputStream inSt = new FileInputStream(in);
				OutputStream outSt = new FileOutputStream(out)) {
			
			int byteCopy = 0;
			byte[] bufferedArray = new byte[1024*1024]; //1mb
			
			for (; (byteCopy = inSt.read(bufferedArray))>0; ) {
				outSt.write(bufferedArray, 0, byteCopy); 
			}
			
		} catch (IOException e) {
			throw e;
		}
	}
	
}
