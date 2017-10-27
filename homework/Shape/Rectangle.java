package com.homework.Shape;

public class Rectangle extends Shape {
	
	private Point a;
	private Point b;
	private Point c;
	
	
	

	public Rectangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return a.sideLenght(b) * a.sideLenght(c);
	}
	
	@Override
	double getPerimetr() {
		// TODO Auto-generated method stub
		return (a.sideLenght(b) + a.sideLenght(c))*2;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", c=" + c + ", " + super.toString();
	}
	
	
}
