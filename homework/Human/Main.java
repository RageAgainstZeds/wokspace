package com.homework.Human;


import com.homework.Human.Exeptions.ClassExeption;
import com.homework.Human.Exeptions.IDExeption;
import com.homework.Human.Exeptions.IDFreeExeption;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws ClassExeption, IDExeption, IDFreeExeption, FileNotFoundException {
				Group group = new Group();

				group.addStudent(new Student("Gooshie", "Milton", "11191990", 'm', 174, 72, "GrannyVerse", "PSAT", "UT-1", 1));
				group.addStudent(new Student("Jane", "Fonda",  "21121937", 'f', 173, 60, "GrannyVerse", "PSAT", "UT-2", 2));
				group.addStudent(new Student("Seymour", "Skinner", "10131960", 'm', 172, 70, "GrannyVerse", "PSAT", "UT-3", 3));
				group.addStudent(new Student("Dolli", "Molly", "11191990", 'f', 160, 55, "GrannyVerse", "PSAT", "UT-2", 1));
				group.addStudent(new Student("Bill", "Hicock", "11191873", 'm', 172, 70, "GrannyVerse", "PSAT", "UT-3", 5));
				group.addStudent(new Student("Dale", "Cooper", "05191963", 'm', 180, 80, "GrannyVerse", "PLAT", "UT-1", 3));
				group.addStudent(new Student("Charles", "Denton", "02061971", 'm', 172, 70, "GrannyVerse", "PSAT", "UT-2", 2));
				group.addStudent(new Student("Charlotta", "Gensburg", "02151978", 'f', 164, 61, "GrannyVerse", "PSAT", "UT-3", 3));
				group.addStudent(new Student("Eva", "Green", "07061980", 'f', 168, 58, "GrannyVerse", "PLAT", "UT-2", 2));
				group.addStudent(new Student("Charles", "Bronson", "03111921", 'm', 174, 70, "GrannyVerse", "PSAT", "UT-3", 4));
				
		
		//group.addStudentPack();
		
		System.out.println(group);
		

		System.out.println("  cooper :");
		group.searchSudent("  cooper ");
		System.out.println("Boon:");
		group.searchSudent("Boon");
		System.out.println("Denton:");
		group.searchSudent("Denton");
		
		group.removeStudent(10);
		System.out.println(group);
		//group.removeStudent(13);
		
		
		//group.addStudent(new Student("Voitsena", "Broski", "03031992", 'f', 160, 55, "GrannyVerse", "PSAT", "UT-1", 1));
		//group.addStudent(new Student("Charles", "Bronson", "03111921", 'm', 174, 70, "GrannyVerse", "PSAT", "UT-3", 4));
		
		System.out.println();
		System.out.println("Sort by age: " + System.lineSeparator() + group.sortByBirth());
		System.out.println("Sort by name: " + System.lineSeparator() + group.sortByName());
		
		//group.printGroup("Z:\\Courses_JAVA\\src\\groupList.csv");
		/*
		 	Example from outcome file:
		 	
		 	Cooper;Dale;05191963;m;180.0;80.0;GrannyVerse;PLAT;UT-1;3;6
			Gensburg;Charlotta;02151978;f;164.0;61.0;GrannyVerse;PSAT;UT-3;3;8
			Green;Eva;07061980;f;168.0;58.0;GrannyVerse;PLAT;UT-2;2;9
			Hicock;Bill;11191873;m;172.0;70.0;GrannyVerse;PSAT;UT-3;5;5
			
		*/
		group.importStudentFromFile("Z:\\Courses_JAVA\\src\\NewStudents.csv");
		
		System.out.println(group);
		
		group.searchSudent("queen");
		
		System.out.println("Start serialization: ");
		
		File file = new File("Z:\\Courses_JAVA\\src\\serialGroup.txt");
		
		group.saveGroupSerialized(file);
		
		Group.loadObjFromFile(file);
		
		System.out.println(Group.loadObjFromFile(file));
		
	}
}