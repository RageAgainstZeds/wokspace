package com.gmail.tsb;

public class Cat extends Animals {
	private String name;
	private String breed;
	
	
	public Cat(int age, double weigt, boolean sex, String ration, String name, String breed) {
		super(age, weigt, sex, ration); //super - посилання на об'єкт з якого наслідувався клас
		this.name = name;
		this.breed = breed;
	}
	
	

	public Cat() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}



	@Override
	public void getVoice() {
		// TODO Auto-generated method stub
		System.out.println("Meow!");
	}



	@Override
	public String toString() {
		return "Cat [name=" + name + ", breed=" + breed + super.toString();
	}
	
	
	
	
	
}
