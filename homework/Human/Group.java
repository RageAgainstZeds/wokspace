package com.homework.Human;

//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
//import java.util.Comparator;
//import java.io.*;
import com.homework.Human.Exeptions.IDExeption;
import com.homework.Human.Exeptions.IDFreeExeption;
import com.homework.Human.Exeptions.ClassExeption;

public class Group {
		//private Student[] classList = new Student[10];
		private List<Student> classList = new ArrayList<>(10);
		
		public Group() {
			super();
		}


		public void addStudent(Student student) throws ClassExeption {
					if (classList.size() < 10) {
						classList.add(student);
						System.out.println("Student "+ student.getSurname() + " " + student.getName() + 
								   " with ID:" + student.getStudentId() + " was added!");
					} else {
						throw new ClassCastException("The group is full!");
					}			
		}
		
		public void removeStudent(int id) throws IDExeption, IDFreeExeption {
			//trying new
			int countI = 0;
			for (Student student : classList) {
				if (id > 10) {
					throw new IDExeption();
				} else {
					if (student.getStudentId() == id) {
						//System.out.println(Student.getListId());
						Student.setListId(Student.getListId()-1);
						classList.remove(countI);
						System.out.println("Student " + student.getSurname() + " " + student.getName() + 
										   " with ID:" + student.getStudentId() + " was deleted!");
						break;
						//System.out.println(Student.getListId());
					}
				}
				countI++;
			}
		}
		
		
		public String searchSudent(String surname) {
			// another try
			for (Student student : classList) {
				if (surname.equals(null)) {
					System.out.println("Cannot be null!");
				}
				else if (student.getSurname().equals(surname.trim())) {
					System.out.println(student.toString());
					break;
				} else {
					//System.out.println("Student doesn't exist!");
				}
			}
			
			return null;	
		}
			


		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Collections.sort(classList, new nameComparator());
			int count = 1;
			for (Student student : classList) {
				if (student == null) {
					sb.append("FREE!");
				} else {
					sb.append(count++ + ")  " + student.getSurname() + " " + student.getName() + 
							  "Student ID: " + student.getStudentId());
				}
				sb.append(System.lineSeparator());			
			}
			return sb.toString();
		}
		
		
		
		
		
		
		
}
