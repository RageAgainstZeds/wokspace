package com.gmail.tsa;

class Car{
		private String color;
		private double weight;
		private int year;
		private double velosity=0;
	
		/*
	//constructors
	public Car(){ 
		//обов'язково записувати конструктор по замовчуванню, нобхідно по специфікації		
	}
	public Car(String color, double weight, int year) {
		this.color = color;
		this.weight = weight;
		this.year = year;
	}
	
	public void setYear (int year) {
		this.year = year;
	}
	
	public int getYear() { //isYear - for bollean, getYear - others
		return year;
	}
	*/
		
	public Car() {
			super();
	}
	public Car(String color, double weight, int year) {
			super();
			this.color = color;
			this.weight = weight;
			this.year = year;
	
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getVelosity() {
		return velosity;
	}
	
	//methods
	public void acceleration (double a){
		velosity=velosity+a;
	}
	public void deceleration(double b){
		if(velosity-b>=0) velosity=velosity-b;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", weight=" + weight + ", year=" + year + ", velosity=" + velosity + "]";
	}
	
	
}

