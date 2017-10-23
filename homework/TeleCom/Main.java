package com.homework.TeleCom;

public class Main {
	public static void main(String[] args) {
		//code
		Phone phone1 = new Phone (123456, "smartphone", "blablaPhone X", true);
		Phone phone2 = new Phone (321654, "phone", "granniePhone", false);
		Phone phone3 = new Phone (456789, "smartphone", "chinaPhone Lao", false);
		Phone phone4 = new Phone (321654, "smartphone", "dumpPhone A111", true);
		
		phone1.autorization(phone1);
		phone2.autorization(phone2);
		phone3.autorization(phone3);
		phone4.autorization(phone4); //trying to register an existing number
		
		phone1.call(phone1, 321654); // call to register number with zero on count
		phone2.call(phone2, 258369); // call to not existed number
		
		phone1.charge(50);
		phone1.call(phone1, 321654); // call to register number with positive count
		
	}
}