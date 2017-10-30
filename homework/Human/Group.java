package com.homework.Human;

import java.util.Arrays;

import com.homework.Human.Exeptions.IDExeption;
import com.homework.Human.Exeptions.IDFreeExeption;
import com.homework.Human.Exeptions.ClassExeption;

public class Group {
		private Student[] classList = new Student[10];
		
		public Group() {
			super();
		}


		public void addStudent(Student student) throws ClassExeption {
			for (int i = 0; i<classList.length; i++) {
				if (classList[i] != null) {
					if (i < 10) {
						classList[i] = student;
						System.out.println("Student added!");
					} else {
						throw new ClassCastException();
					}
				}
			}
		}
		
		public void removeStudent(int id) throws IDExeption, IDFreeExeption {
			if (id >= 10) {
				throw new IDExeption();
			} else
			if (this.classList[id-1] == null) {
				throw new IDFreeExeption();
			} else {
				classList[id-1] = null;
				System.out.println("Student deleted!");
			}
		}
		
		
		public String searchSudent(String surname) {
			for (int i = 0; i < classList.length; i++) {
				if (classList[i] == null) {
					
				} else if(classList[i].getName().equalsIgnoreCase(surname)) {
					System.out.println(classList[i].toString());
				} else {
					System.out.println("This student doesn't exist!");
				}
			}
			return null;	
		}
			


		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			
			Arrays.sort(classList, new nameComparator());
			
			for (Student student : classList) {
				int count = 1;
				if (student != null) {
					sb.append(count ++);
				} /*else if (student == null) {
					sb.append("FREE!");
				}*/
				sb.append(System.lineSeparator());
			}
			
			return sb.toString();
		}
		
		
		
		
		
		
		
}
