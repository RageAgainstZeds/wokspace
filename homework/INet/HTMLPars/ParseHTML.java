package com.homework.INet.HTMLPars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ParseHTML {
	public static void extractHREF(File fileIn, File fileOut) {
		try {
			Document doc = Jsoup.parse(fileIn, "UTF-8");
			
			/*Elements elements = doc.select("a[href]");
			for (Element element : elements) {
				String text = element.attr("abs:href");
				System.out.println(text);
			}*/
			
			FileWriter fw = new FileWriter(fileOut, true);
			//Element content = doc.getElementById("content");
			Elements links = doc.getElementsByTag("a");
			for (Element link : links) {
				String linkHref = link.attr("abs:href");
				if (linkHref.equals("")) {}
				else {
					fw.write(linkHref + System.lineSeparator());
				}
			}
			fw.close();
			System.out.println("Parsing complete!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
