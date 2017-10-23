package com.homework.TeleCom;

import java.util.ArrayList;

public class Network {
	
	static private ArrayList<Integer> msisdnDB = new ArrayList<Integer>();
		
	public void authorization(Phone phone) {
		//add new number into DB
		if (msisdnDB.contains(phone.getMsisdn()) == false) {
			msisdnDB.add(phone.getMsisdn());
			System.out.println("Phone identifier register.");
		}
		else {
			System.out.println("Number already exist.");
		}
	}
	
	public void makingCall(Phone phone, int msisdn) {
		//check if number exist in the base 
		//and if abon have rights to make a call
		//means positive balance
		if (msisdnDB.contains(msisdn) == true) {
			//System.out.println("Calling " + phone.getMsisdn());
			if ( phone.getBalance() <= 0 ) {
				System.out.println("Not enought money.");
			}
			else {
				System.out.println("Calling " + msisdn);
			}
		}
		else {
			System.out.println("Number doesn't exist.");
		}
		
		
		
	}
	
}
