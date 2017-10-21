package com.homework.Cat;

public class Main {
	public static void main(String[] args) {
		//CODE
		Cat cat1 = new Cat("Luk", 2012, "Grey", 2.7, true, 'm', true);
		Cat cat2 = new Cat("Fluffy", "Black", false, 'f');
		Cat cat3 = new Cat("Fat", "Red", false, 'm');
	
		//time to vaccinating!
		cat1.vaccinate();
		cat2.vaccinate();
		cat3.vaccinate();
		
		cat1.voice();
		cat2.voice();
		cat3.voice();
		
		cat2.setName("Lucy");
		System.out.println(cat2.getName());
		
		System.out.println("We have " + Cat.getCatCount() + " cats in our house.");
		
		
	}
}
