package com.gmail.tsb;

public class Main {
	public static void main(String[] args) {
		//code
		Cat catOne = new Cat(5, 5, true, "meat", "Luk", "Siberian");
		Dog dogOne = new Dog(5, 5, true, "raw meat", "good", "Loh");
		
		HomeZoo zoo = new HomeZoo("Home Zoo");
		
		zoo.addAnimal(catOne);
		zoo.addAnimal(dogOne);
		
		System.out.println(zoo);
		
		
	}
}
