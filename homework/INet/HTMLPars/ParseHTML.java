package com.homework.INet.HTMLPars;

import java.io.File;
import java.io.IOException;

import javax.naming.LinkRef;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ParseHTML {
/*	File input = new File("/tmp/input.html");
	Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
	
	Element content = doc.getElementById("content");
	Elements links = content.getElementsByTag("a");
	for (Element link : links) {
	  String linkHref = link.attr("href");
	  String linkText = link.text();
}
	*/
	
	public static void extractHREF(File fileOut) {
		try {
			Document doc = Jsoup.parse(fileOut, "UTF-8");
			
			/*Elements elements = doc.select("a[href]");
			for (Element element : elements) {
				String text = element.attr("abs:href");
				System.out.println(text);
			}*/
			
			//Element content = doc.getElementById("content");
			Elements links = doc.getElementsByTag("a");
			for (Element link : links) {
				String linkHref = link.attr("abs:href");
				if (linkHref.equals("")) {}
				else {
					System.out.println(linkHref);
				}
				//String linkText = link.text();
				//System.out.println(linkText);
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
