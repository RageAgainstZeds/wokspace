package com.homework.Human;

import javax.swing.JOptionPane;
//import java.util.Comparator;

public class Student extends Human {
		private String universityName;
		private String faculty;
		private String groupName;
		private int course;
		private int studentId;
		private static int listId = 0;
		
		public Student(String name, String surname, String birth, char sex, double height, double weight,
				String universityName, String faculty, String groupName, int course) {
			super(name, surname, birth, sex, height, weight);
			this.universityName = universityName;
			this.faculty = faculty;
			this.groupName = groupName;
			this.course = course;
			this.studentId = Student.listId+1;
			Student.listId++;
		}
		
		public Student() {
			//super(name, surname, birth, sex, height, weight);
			
			//Integer.valueOf(JOptionPane.showInputDialog("How many students do You want add?"));
			
			super.setName(String.valueOf(JOptionPane.showInputDialog("Enter the Student name")));
			super.setSurname(String.valueOf(JOptionPane.showInputDialog("Enter the Student surname")));
			super.setBirth(String.valueOf(JOptionPane.showInputDialog("Enter the Student birth")));
			String sex = String.valueOf(JOptionPane.showInputDialog("Enter the Student sex ('m' or 'f')"));
			super.setSex(sex.charAt(0));
			super.setHeight(Double.valueOf(JOptionPane.showInputDialog("Enter the Student height")));
			super.setWeight(Double.valueOf(JOptionPane.showInputDialog("Enter the Student weight")));
			
			this.universityName = String.valueOf(JOptionPane.showInputDialog("Enter the University name"));
			this.faculty = String.valueOf(JOptionPane.showInputDialog("Enter the faculty name"));
			this.groupName = String.valueOf(JOptionPane.showInputDialog("Enter the group name"));
			this.course = Integer.valueOf(JOptionPane.showInputDialog("Enter the course (int)"));
			this.studentId = Student.listId+1;
			Student.listId++;
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
		
/*		public static Comparator<Student> StudentName = new Comparator<Student>() {
			@Override
			public int compare(Student st1, Student st2) {
				return st1.getSurname().compareTo(st2.getSurname());
			}
		};*/
		


		@Override
		public String toString() {
			return super.toString() + "Student [universityName=" + universityName + ", faculty=" + faculty + ", groupName=" + groupName
					+ ", course=" + course + "]";
		}




		
		
		
		
		
}
