package com.gmail.tsg;

public class Reciever implements Runnable {
		
		private Provider pro;
		private String text;

		
		
		public Reciever() {
			super();
		}

		
		public Reciever(Provider pro, String text) {
			super();
			this.pro = pro;
			this.text = text;
		}


		public String getText() {
			return text;
		}


		public void setText(String text) {
			this.text = text;
		}

		public void printText() {
			System.out.println(text);
		}
		
		@Override
		public String toString() {
			return "Reciever [text=" + text + "]";
		}

		@Override
		public void run() {
			for (int i = 0; i < 20; i++) {
				printText();
				pro.s
			}
		}
		
		
		
}
