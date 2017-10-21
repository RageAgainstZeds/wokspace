package com.homework.Cat;
//import java.util.Date;
import java.util.Calendar;


public class Cat {
	//Cat 
	private String name;
	private int birthYear;
	private String color;
	private double weight;
	private boolean agressive;
	private char sex;
	private boolean vaccinated;
	
	static private int catCount = 0;
	
	
	public Cat() {
		super();
	}

	
	public Cat(String name, String color, boolean agressive, char sex) {
		super();
		this.name = name;
		this.birthYear = Calendar.getInstance().get(Calendar.YEAR) - 2;
		this.color = color;
		this.weight = 2.5;
		this.agressive = agressive;
		this.sex = sex;
		this.vaccinated = false;
		catCount++;
	
		
	}



	public Cat(String name, int birthYear, String color, double weight, boolean agressive, char sex, boolean vaccinated) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.color = color;
		this.weight = weight;
		this.agressive = agressive;
		this.sex = sex;
		this.vaccinated = vaccinated;
		catCount++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
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

	public boolean isAgressive() {
		return agressive;
	}

	public void setAgressive(boolean agressive) {
		this.agressive = agressive;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	

	public boolean isVaccinated() {
		return vaccinated;
	}
	
	

	public static int getCatCount() {
		return catCount;
	}


	@Override
	public String toString() {
		return "Cat [name=" + name + ", birthYear=" + birthYear + ", color=" + color + ", weight=" + weight
				+ ", agressive=" + agressive + ", sex=" + sex + "]";
	}
	
	public void voice() {
		if (agressive == true) {
			System.out.println("Cat "+ name + " sounding like: Rrrrraw!");
		}
		else {
			System.out.println("Cat "+ name + " sounding like: Meow! Phrrr...");
		}
	}
	
	public void vaccinate() {
		if (vaccinated == true) { 
			System.out.println("The cat " + name + " is already vaccinated.");
		}
		else {
			vaccinated = true;
			System.out.println("The cat " + name + " is vaccinated now!");
		}
	}
	
	
	
}
