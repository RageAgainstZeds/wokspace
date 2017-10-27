package com.homework.Shape;

public class Main {
	public static void main(String[] args) {
		
		Point rectPointOne = new Point(0, 0);
		Point rectPointTwo = new Point(-1, 3);
		Point rectPointThree = new Point(3, 8);
		Rectangle rectOne = new Rectangle(rectPointOne, rectPointTwo, rectPointThree);
		//System.out.println("Rectangle area = " + rectOne.getArea());
		//System.out.println(rectOne);
				
		Point triPointOne = new Point(1, 1);
		Point triPointTwo = new Point(2, 5);
		Point triPointThree = new Point(10, 6);
		Triangle triOne = new Triangle(triPointOne, triPointTwo, triPointThree);
		//System.out.println(triOne);
		
		Point cirPointOne = new Point(3, 3);
		Point cirPointOTwo = new Point(6, 13);
		Circle cirOne = new Circle(cirPointOne, cirPointOTwo);
		//System.out.println(cirOne);
		
		Desk deskOne = new Desk();
		deskOne.addItem(rectOne);
		deskOne.addItem(triOne);
		deskOne.addItem(cirOne);
		deskOne.addItem(triOne);
		
		System.out.println(deskOne.toString());
		
		deskOne.removeItems();
		
		System.out.println(deskOne.toString());
	}

}
