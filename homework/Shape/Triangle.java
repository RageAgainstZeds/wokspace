package com.homework.Shape;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	double getPerimetr() {
		// TODO Auto-generated method stub
		return a.sideLenght(b) + a.sideLenght(c) + b.sideLenght(c);
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		double p = getPerimetr() / 2;
		return Math.sqrt(p - a.sideLenght(b) + (p - a.sideLenght(c)) + (p - c.sideLenght(b)));
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", " + super.toString();
	}
	
	
	
	
}
