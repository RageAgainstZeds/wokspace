package com.gmail.tsd;

public class Cat implements Play {
	private String name;
	private int age;
	private String  color;
	public Cat(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	@Override
	public boolean canBroke() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String play() {
		// TODO Auto-generated method stub
		if (age < 1) {
			return "Jump! Run! Miu! ";
		} else {
			return "Zzzzzz...";
		}
	}
	
	
}
