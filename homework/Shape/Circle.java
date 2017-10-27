package com.homework.Shape;

public class Circle extends Shape {
	private Point zero;
	private Point rad;
	
	public Circle(Point a, Point b) {
		super();
		this.zero = a;
		this.rad = b;
	}
	public Circle() {
		super();
	}
	public Point getA() {
		return zero;
	}
	public void setA(Point a) {
		this.zero = a;
	}
	public Point getB() {
		return rad;
	}
	public void setB(Point b) {
		this.rad = b;
	}
	
	@Override
	double getPerimetr() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * zero.sideLenght(rad);
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(zero.sideLenght(rad), 2);
	}
	
	@Override
	public String toString() {
		return "Circle [zeroPoint=" + zero + ", b=" + rad + ", " + super.toString();
	}
	
	
	
}
