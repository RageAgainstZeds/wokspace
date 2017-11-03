package com.gmail.tsd;

public class Ball implements Play {
		private int size;
		private String color;
		
		public Ball(int size, String color) {
			super();
			this.size = size;
			this.color = color;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		
		
		@Override
		public boolean canBroke() {
			// TODO Auto-generated method stub
			return true;
		}
		@Override
		public String play() {
			// TODO Auto-generated method stub
			return "BIG BADA BOOM!!!";
		}
		
		
		@Override
		public String toString() {
			return "Ball [size=" + size + ", color=" + color + "]";
		}
		
}
