package com.gmail.tsd;

public class Car implements Play{
	private String type;
	private String color;
	
	public Car(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", color=" + color + "]";
	}
	@Override
	public boolean canBroke() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Eron don don!";
	}
	
	
	
	
	
	
	
}
