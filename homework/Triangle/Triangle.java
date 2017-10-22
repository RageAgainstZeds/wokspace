package com.homework.Triangle;

import java.lang.Math;


public class Triangle {
	private double a;
	private double b;
	private double c;
	
	
	
	public Triangle(double a, double b, double c) {
		super();
		
		this.a = Math.abs(a);
		this.b = Math.abs(b);
		this.c = Math.abs(c);
	}
	
	public Triangle() {
		
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	
	
	public double area() {
		double p = (a + b+ c)/2;
		double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return S;
	}
	
}
