package com.homework.TeleCom;

public class Phone {
	private int msisdn;
	private String type;
	private String model;
	private boolean support4G;
	private double balance = 0;
	
	public Phone(int msisdn, String type, String model, boolean support4g) {
		super();
		this.msisdn = msisdn;
		this.type = type;
		this.model = model;
		this.support4G = support4g;
	}
	public int getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(int msisdn) {
		this.msisdn = msisdn;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isSupport4G() {
		return support4G;
	}
	public void setSupport4G(boolean support4g) {
		this.support4G = support4g;
	}
	public double getBalance() {
		return balance;
	}
	
	public void charge(double charge) {
		this.balance += charge;
	}
	
	public void autorization(Phone phone) {
		Network netw = new Network();
		netw.authorization(phone);
	}
	
	public void call(Phone phone, int msisdn) {
		Network netw = new Network();
		netw.makingCall(phone, msisdn);
		
	}
	
	
	
	
}
