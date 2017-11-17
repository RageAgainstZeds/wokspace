package com.homework.Human;

import java.io.Serializable;

public class Human implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String name;
		private String surname;
		private String birth;
		private char sex;
		private double height;
		private double weight;
		
		public Human(String name, String surname, String birth, char sex, double height, double weight) {
			super();
			this.name = name;
			this.surname = surname;
			this.birth = birth;
			this.sex = sex;
			this.height = height;
			this.weight = weight;
		}
		
		public Human() {
			super();
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getBirth() {
			return birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		public char getSex() {
			return sex;
		}
		public void setSex(char sex) {
			this.sex = sex;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "Human [name=" + name + ", surname=" + surname + ", birth=" + birth + ", sex=" + sex + ", height=" + height + ", weight="
					+ weight + "]";
		}
		
}
