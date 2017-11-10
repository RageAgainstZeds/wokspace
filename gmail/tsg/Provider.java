package com.gmail.tsg;

public class Provider {
	private String value;
	
	private boolean turn = true;
	private boolean stop = false;
	
	
	
	public Provider() {
		super();
	}




	public Provider(String value, boolean turn, boolean stop) {
		super();
		this.value = value;
		this.turn = turn;
		this.stop = stop;
	}
	
	
	
	
	public String getValue() {
		return value;
	}




	public void setValue(String value) {
		this.value = value;
	}




	public boolean isTurn() {
		return turn;
	}




	public void setTurn(boolean turn) {
		this.turn = turn;
	}


	public boolean isStop() {
		return stop;
	}
		public void setStop(boolean stop) {
		this.stop = stop;
	}
}
