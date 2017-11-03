package com.gmail.tsb;

public class HomeZoo {
	
	private String name;
	
	private Animals[] animalsArray = new Animals[10];

	public HomeZoo(String name) {
		super();
		this.name = name;
	}

	public HomeZoo() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addAnimal (Animals animals) {
		for (int i = 0; i < animalsArray.length; i++) {
			if (animalsArray[i] == null) {
				animalsArray[i] = animals;
				return;
			}
			System.out.println("Sorry, Zoo is full!");
		}
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(System.lineSeparator());
		int cellNumber = 1;
		for (Animals animals : animalsArray) { // "animals : animalsArray" - for each
			sb.append(cellNumber++).append(") ");
			if (animals == null) {
				sb.append("FREE");
				
			} else {
				sb.append(animals);
			}
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
}
