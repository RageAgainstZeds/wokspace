package com.homework.Shape;

public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
	public Point() {
		super();
	}


	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double sideLenght(Point B) {
		return Math.sqrt(Math.pow(B.x - this.x, 2) + Math.pow(B.y - this.y, 2));
	}



	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
