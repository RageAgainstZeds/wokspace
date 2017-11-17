package com.gmail.tshObject;

import java.io.Serializable;

public class Cat implements Cloneable,Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private String name;
		private int age;
		private String color;
		public Cat(String name, int age, String color) {
			super();
			this.name = name;
			this.age = age;
			this.color = color;
		}
		public Cat() {
			super();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		@Override
		public String toString() {
			return "Cat [name=" + name + ", age=" + age + ", color=" + color + "]";
		}
		
		@Override
		protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
			System.out.println(this + " deleted!");
		super.finalize();
		
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cat other = (Cat) obj;
			if (age != other.age)
				return false;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		@Override
		public Cat clone() throws CloneNotSupportedException {
			return (Cat) super.clone();
		}
		
		
		
}
