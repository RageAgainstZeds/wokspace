package com.gmail.tsg;

public class Main {
	public static void main(String[] args) {
		
		Provider pro = new Provider();
		
		//Transiver trans = new Transiver(pro, "PULL");
		Reciever reciv = new Reciever(pro, "PUSH");
		
		//Thread thOne = new Thread(trans);
		Thread thTwo = new Thread(reciv);
		
		//thOne.start();
		thTwo.start();
		
		
	}
}
