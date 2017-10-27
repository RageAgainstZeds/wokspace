package com.homework.Shape;

public class Desk {
	private Shape[] deskArr = new Shape[4];
	
	
	public Desk() {
		super();
	}

	public void addItem(Shape shape) {
		
		for (int i = 0; i<deskArr.length; i++) {
			if (deskArr[i] == null) {
				deskArr[i] = shape;
				break;
			} 			
			
		}
		//System.out.println("All cells not free tonight");
		return;
	}
	
	public void removeItems() {
		for (int i = 0; i<deskArr.length; i++) {
			if (deskArr[i] != null) {
				deskArr[i] = null;
			}
		
		}
		System.out.println("Desk is clear! Give another shot!" );
		return;
	}
	

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		double summaryArea = 0;
		int sectorNum = 1;
		
		for (Shape shape : deskArr) {
			
			sb.append(sectorNum++ + " sector: ");
			if (shape == null) {
				sb.append("FREE!");
			} else {
				sb.append(shape + "The area is - " + shape.getArea());
				summaryArea += shape.getArea();
			} 
			sb.append(System.lineSeparator());
		}
		sb.append("Area Summary is " + summaryArea + System.lineSeparator());
		return sb.toString();
	}
	
}
