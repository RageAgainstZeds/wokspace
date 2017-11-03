package com.gmail.tsd;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Baby baby1 = new Baby("Vasya", "Sisihsh", 3);
		Baby baby2 = new Baby("Olga", "Knyaz", 3);
		Baby baby3 = new Baby("Kook", "Pook", 2);
		Baby baby4 = new Baby("Germa", "Joint", 4);
		Baby baby5 = new Baby("Hoopo", "Floppy", 3);

		Cat cat = new Cat("Poop", 4, "Black");
		Ball ball = new Ball(10, "Green");
		Car car1 = new Car("Jeep", "Red");
		
		baby1.playWith(cat);
		baby2.playWith(ball);
		baby3.playWith(car1);
		Baby[] arrayBaby = new Baby[] { baby1, baby2, baby3, baby4, baby5 };
		
		printArray(arrayBaby);
		System.out.println();
		Arrays.sort(arrayBaby);
		printArray(arrayBaby);
	}

	public static void printArray(Baby[] arrayBaby) {
		for (Baby baby : arrayBaby) {
			System.out.println(baby);
		}
	}

}
