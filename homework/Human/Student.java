package com.homework.Human;

import java.io.Serializable;
import java.util.Calendar;
/*
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
*/

public class Student extends Human implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private String universityName;
		private String faculty;
		private String groupName;
		private int course;
		private int studentId;
		private static int listId = 0;
		private int age;
		
		public Student(String name, String surname, String birth, char sex, double height, double weight,
				String universityName, String faculty, String groupName, int course) {
			super(name, surname, birth, sex, height, weight);
			this.universityName = universityName;
			this.faculty = faculty;
			this.groupName = groupName;
			this.course = course;
			this.studentId = Student.listId+1;
			Student.listId++;
			this.age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(birth.substring(birth.length()-4));
		}
		
		
		public Student() {
			//super(name, surname, birth, sex, height, weight);
			
			//Integer.valueOf(JOptionPane.showInputDialog("How many students do You want add?"));
			
			
			
		}

		public Student(String name, String surname, String birth, char sex, double height, double weight) {
			super(name, surname, birth, sex, height, weight);
		}

		public String getUniversityName() {
			return universityName;
		}

		public void setUniversityName(String universityName) {
			this.universityName = universityName;
		}

		public String getFaculty() {
			return faculty;
		}

		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}

		public String getGroupName() {
			return groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public int getCourse() {
			return course;
		}

		public void setCourse(int course) {
			this.course = course;
		}
		
		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public static int getListId() {
			return listId;
		}

		public static void setListId(int listId) {
			Student.listId = listId;
		}
		
		public int getAge() {
			return age;
		}
		
/*		public static Comparator<Student> StudentName = new Comparator<Student>() {
			@Override
			public int compare(Student st1, Student st2) {
				return st1.getSurname().compareTo(st2.getSurname());
			}
		};
*/

		@Override
		public String toString() {
			return super.toString() + "Student [universityName=" + universityName + ", faculty=" + faculty + ", groupName=" + groupName
					+ ", course=" + course + "]";
		}




		
		
		
		
		
}
