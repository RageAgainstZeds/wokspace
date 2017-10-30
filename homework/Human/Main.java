package com.homework.Human;


import com.homework.Human.Exeptions.ClassExeption;
import com.homework.Human.Exeptions.IDExeption;
import com.homework.Human.Exeptions.IDFreeExeption;

public class Main {
	public static void main(String[] args) throws ClassExeption {
	
		Student studentOne = new Student("Gooshie", "Milton", "11191990", 'm', 174, 72, "GrannyVerse", "PSAT", "UT-1", 1);
		Student studentTwo = new Student("Jane", "Fonda",  "21121937", 'f', 173, 60, "GrannyVerse", "PSAT", "UT-2", 2);
		Student studentThree = new Student("Seymour", "Skinner", "10131960", 'm', 172, 70, "GrannyVerse", "PSAT", "UT-3", 3);
		Student studentFour = new Student("Dolli", "Molly", "11191990", 'f', 160, 55, "GrannyVerse", "PSAT", "UT-2", 1);
		Student studentFive = new Student("Bill", "Hicock", "11191873", 'm', 172, 70, "GrannyVerse", "PSAT", "UT-3", 5);
		Student studentSix = new Student("Dale", "Cooper", "05191963", 'm', 180, 80, "GrannyVerse", "PLAT", "UT-1", 3);
		Student studentSeven = new Student("Charles", "Denton", "02061971", 'm', 172, 70, "GrannyVerse", "PSAT", "UT-2", 2);
		Student studentEight = new Student("Charlotta", "Gensburg", "02151978", 'f', 164, 61, "GrannyVerse", "PSAT", "UT-3", 3);
		Student studentNine = new Student("Eva", "Green", "07061980", 'f', 168, 58, "GrannyVerse", "PLAT", "UT-2", 2);
		Student studentTen = new Student("Charles", "Bronson", "03111921", 'm', 174, 70, "GrannyVerse", "PSAT", "UT-3", 4);
		Student studentEleven = new Student("Voitsena", "Broski", "03031992", 'f', 160, 55, "GrannyVerse", "PSAT", "UT-1", 1);
		
		System.out.println(studentTen);
		
		Group group = new Group();
		
//		try {
				group.addStudent(studentOne);
				System.out.println(group.toString());
				group.addStudent(studentTwo);
				group.addStudent(studentThree);
				group.addStudent(studentFour);
				group.addStudent(studentFive);
				group.addStudent(studentSix);
				group.addStudent(studentSeven);
				group.addStudent(studentEight);
				group.addStudent(studentNine);
				group.addStudent(studentTen);
				group.addStudent(studentEleven);
/*		} catch (ClassExeption e) {
			e.getMessage();
		}*/
		
		System.out.println(group.toString());
		
		group.searchSudent("Boon");
		group.searchSudent("Cooper");
		
		try {
			group.removeStudent(7);
			group.removeStudent(13);
			group.removeStudent(7);
		} catch (IDExeption | IDFreeExeption f) {
			f.getMessage();
		}
		
		
		System.out.println(group.toString());
		
		
		
		
		
	}
}
