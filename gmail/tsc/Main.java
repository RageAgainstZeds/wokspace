package com.gmail.tsc;

import javax.swing.JOptionPane;
public class Main {
		public static void main(String[] args) {
		double a;
	for(;;){
		try{
			a=Double.valueOf(JOptionPane.showInputDialog("Input double number"));
			break;
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Error number format");
		}
		catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null,"If u decline c = 11 since now");
			a = 11;
			break;
		}
	}
		System.out.println(a);
	}
}
