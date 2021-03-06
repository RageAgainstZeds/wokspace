package com.homework.Human;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JOptionPane;
import java.util.Scanner;
//import java.util.Comparator;
//import java.io.*;
import com.homework.Human.Exeptions.IDExeption;
import com.homework.Human.Exeptions.IDFreeExeption;
import com.homework.Human.Comparators.*;
import com.homework.Human.Exeptions.ClassExeption;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Group implements WarCom {
		//private Student[] classList = new Student[10];
		private List<Student> classList = new ArrayList<>(10);
		
		public Group() {
			super();
		}


		public void addStudent(Student student) throws ClassExeption {
					if (student == null) {
						throw new IllegalArgumentException("Cannot be null!");
						//System.out.println("Cannot be null!");
					}
					else if (classList.size() < 10) {
						classList.add(student);
						System.out.println("Student "+ student.getSurname() + " " + student.getName() + 
								   " with ID:" + student.getStudentId() + " was added!");
					} else {
						throw new ClassCastException("The group is full!");
					}
		}
		
		public void removeStudent(int id) throws IDExeption, IDFreeExeption {
			//
			int countI = 0;
			for (Student student : classList) {
				if (id > 10) {
					throw new IDExeption();
				} else {
					if (student.getStudentId() == id) {
						classList.remove(countI);
						System.out.println("Student " + student.getSurname() + " " + student.getName() + 
										   " with ID:" + student.getStudentId() + " was deleted!");
						break;
					}
				}
				countI++;
			}
		}
		
		
		public Student searchSudent(String surname) {
			// another try
			for (Student student : classList) {
				if (surname.equals(null)) {
					System.out.println("Cannot be null!");
				}
				else if (student.getSurname().equalsIgnoreCase(surname.trim())) {
					System.out.println(student);
					return student;
					
					//break;
				} else {
					//System.out.println("Student doesn't exist!");
				}
			}
			System.out.println("Not Found!");
			return null;	
		}
		
		public void addStudentPack () throws ClassExeption {
			int a = 0;
			try {a = Integer.valueOf(JOptionPane.showInputDialog("How many students do You want add?"));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format! Print Integer DUMBASS!");
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Bye-bye!");
			}
			if (a > 0) {
				for(int i = 0; i < a; i++){
					try {String name = String.valueOf(JOptionPane.showInputDialog("Enter the Student name"));
						String surname = String.valueOf(JOptionPane.showInputDialog("Enter the Student surname"));
						String birth = String.valueOf(JOptionPane.showInputDialog("Enter the Student birth"));
						String sexStr = String.valueOf(JOptionPane.showInputDialog("Enter the Student sex ('m' or 'f')"));
						char sex = sexStr.charAt(0);
						Double height = Double.valueOf(JOptionPane.showInputDialog("Enter the Student height"));
						Double weight = Double.valueOf(JOptionPane.showInputDialog("Enter the Student weight"));
						String universityName = String.valueOf(JOptionPane.showInputDialog("Enter the University name"));
						String faculty = String.valueOf(JOptionPane.showInputDialog("Enter the faculty name"));
						String groupName = String.valueOf(JOptionPane.showInputDialog("Enter the group name"));
						int course = Integer.valueOf(JOptionPane.showInputDialog("Enter the course (int)"));
						Student.setListId(Student.getListId() + 1);
						addStudent(new Student(name, surname, birth, sex, height, weight, universityName, faculty, groupName, course));
					} catch(NullPointerException e) {
						e.getMessage();
					}	
				}
			}
		}
		
		//sort by Birth
		public String sortByBirth() {
			StringBuilder sb = new StringBuilder();
			Collections.sort(classList, new AgeComparator());
			int count = 1;
			for (Student student : classList) {
				if (student == null) {
					sb.append("FREE!");
				} else {
					sb.append(count++ + ")  " + student.getSurname() + " " + student.getName() + " " +
							  "Student ID: " + student.getStudentId() + " " + student.getBirth() +
							  " " + student.getAge());
					//sb.append();
				}
				sb.append(System.lineSeparator());
			}
			return sb.toString();
		}
		
		//sort by name
		public String sortByName() {
			StringBuilder sb = new StringBuilder();
			Collections.sort(classList, new NameComparator());
			int count = 1;
			for (Student student : classList) {
				if (student == null) {
					sb.append("FREE!");
				} else {
					sb.append(count++ + ")  " + student.getSurname() + " " + student.getName() + " " +
							  "Student ID: " + student.getStudentId() + " " + student.getBirth() +
							  " " + student.getAge());
				}
				sb.append(System.lineSeparator());			
			}
			return sb.toString();
		}
		
		public void printGroup (String fileUpload) {
			Collections.sort(classList, new NameComparator());
			
			try(FileWriter fileOut = new FileWriter(new File(fileUpload))) {
	            //write final list into the file
				for (Student student : classList) {
					fileOut.write(student.getSurname() + ";" + student.getName() + ";" + student.getBirth() + ";" + 
								  student.getSex() + ";" + student.getHeight() + ";" + student.getWeight() + ";" + 
								  student.getUniversityName() + ";" + student.getFaculty() + ";" + student.getGroupName() + ";" + 
								  student.getCourse() + ";" + student.getStudentId() + System.lineSeparator());
				}
	            fileOut.flush();
	            fileOut.close();
	            System.out.println("File Write Successfully!");
	        }
	        catch (IOException ex) {
	            System.out.println(ex.getMessage());
	        }
		}
		
		public void importStudentFromFile(String adress) throws ClassExeption {
			try {
				File file = new File(adress);
				Scanner sc = new Scanner(file);
				while (sc.hasNext()) {
					String[] parseList = sc.nextLine().split("[;]");
						try {String name = parseList[0];
							String surname = parseList[1];
							String birth = parseList[2];
							String sexStr = parseList[3];
							char sex = sexStr.charAt(0);
							Double height = Double.parseDouble(parseList[4]);
							Double weight = Double.parseDouble(parseList[5]);
							String universityName = parseList[6];
							String faculty = parseList[7];
							String groupName = parseList[8];
							int course = Integer.parseInt(parseList[9]);
							Student.setListId(Student.getListId() + 1);
							addStudent(new Student(name, surname, birth, sex, height, weight, universityName, faculty, groupName, course));
						} catch(NullPointerException e) {e.getMessage();}
					}
					sc.close();
			} catch (FileNotFoundException e) {e.printStackTrace();}
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Collections.sort(classList, new NameComparator());
			int count = 1;
			for (Student student : classList) {
				if (student == null) {
					sb.append("FREE!");
				} else {
					sb.append(count++ + ")  " + student.getSurname() + " " + student.getName() + " " +
							  "Student ID: " + student.getStudentId());
				}
				sb.append(System.lineSeparator());			
			}
			return sb.toString();
		}


		@Override
		public List<Student> getRecruts() {
			List<Student> recrutsList = new ArrayList<>();
			
			for (Student student : classList) {
				if (student.getAge() > 17) {
					recrutsList.add(student);
				} else {
				
				}		
			}
			return recrutsList;
		}
		
		//serialization
		@SuppressWarnings("resource")
		public static void serialisationSavePrep(File file, Object obj) {
			try {
				ObjectOutput outObj = new ObjectOutputStream(new FileOutputStream(file, true));
				outObj.writeObject(obj);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void saveGroupSerialized (File file) {
			for (Student student : classList) {
				Group.serialisationSavePrep(file, student);
			}
		}
		
		@SuppressWarnings("resource")
		public static Object loadObjFromFile(File file) throws FileNotFoundException {
			Scanner sc = new Scanner(file);
			
				try {
					while (sc.hasNext()) {
						ObjectInput objInp = new ObjectInputStream(new FileInputStream(file));
						return objInp.readObject();
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			return null;
		}
		
}
