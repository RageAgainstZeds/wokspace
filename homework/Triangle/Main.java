package com.homework.Triangle;

public class Main {
	public static void main(String[] args) {
		//code
		Triangle triangle1 = new Triangle(-3, 6, -6);
		Triangle triangle2 = new Triangle(10, 10, 10);
		Triangle triangle3 = new Triangle(13, 20, 8);
		
		System.out.println(triangle1.area());
		System.out.println(triangle2.area());
		System.out.println(triangle3.area());
	}
}
