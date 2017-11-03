package com.gmail.tsb;

public class Dog extends Animals {
	private String smell;
	private String name;
	
	
	
	public Dog(int age, double weigt, boolean sex, String ration, String smell, String name) {
		super(age, weigt, sex, ration);
		this.smell = smell;
		this.name = name;
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public String getSmell() {
		return smell;
	}

	public void setSmell(String smell) {
		this.smell = smell;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void getVoice() {
		// TODO Auto-generated method stub
		super.getVoice();
	}

	@Override
	public String toString() {
		return "Dog [smell=" + smell + ", name=" + name + super.toString();
	}
	
	
	
	
}
