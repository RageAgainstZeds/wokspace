package com.gmail.tsg;

public class Transiver implements Runnable {
	private Provider pro;
	private String text;

	
	
	public Transiver() {
		super();
	}

	

	public Transiver(String text) {
		super();
		this.text = text;
	}



	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Transiver [text=" + text + "]";
	}
	
	public void printText() {
		System.out.println(text);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			printText();
			pro.setValue(this.text);
		}
		

		
	}
	
	
}
