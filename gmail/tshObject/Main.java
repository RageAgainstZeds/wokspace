package com.gmail.tshObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Collectors;

public class Main {
	public static Cat cat = null;
	
	public static void main(String[] args) {
		
		/*Cat catOne = new Cat("Goof", 4, "Orange");		
		System.out.println(catOne);
		
		catOne = null;
		
		System.gc(); //примусовий запуск зірника сміття
		
		try {
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println(cat);
		
		cat = null;
		try {
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		System.out.println(cat);
		System.out.println("Done/");*/
		
		
		Cat catOne = new Cat("Goof", 4, "Orange");
		Cat catTwo = new Cat("Goof", 4, "Orange");
	
		System.out.println(catOne == catTwo);
		System.out.println(catOne.equals(catTwo));
		Cat catThree = null;
		
		try {
			catThree = catTwo.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		System.out.println();
		System.out.println(catThree == catTwo);
		System.out.println(catThree.equals(catTwo));
	
		System.out.println("Get Class: ");
		Class catClass = Cat.class;
		Class catClassSS = catOne.getClass();
		
		System.out.println();
		
		Field[] fields = catClassSS.getDeclaredFields();
			for (Field field : fields) {
				System.out.println("Field: "+ field);
				
			}
		System.out.println();
		
		Method[] methids = catClass.getDeclaredMethods();
		for (Method method : methids) {
			System.out.println(method);
		}
		System.out.println();
		
		Constructor<?> [] construstors = catClass.getDeclaredConstructors();
			for (Constructor<?> constructor : construstors) {
				System.out.println(constructor);
			}
		System.out.println();
		
		//зміна значення приватної змінної
		try {
			Field catAge = catClass.getDeclaredField("age");
			catAge.setAccessible(true);
			catAge.setInt(catTwo, -100);
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		System.out.println(catTwo);
		
		//
		System.out.println(catOne.getClass().equals(Cat.class));
		
		
		
		//Serialization
		File file = new File("Z:\\Courses_JAVA\\src\\cat.txt");
		//saveObject(catTwo, file);
		Cat catFour = (Cat) loadInFile(file);
		
		System.out.println("Reading from file " + catFour);
	}
	
	public static void saveObject(Object obj, File file) {
		try(ObjectOutput ods = new ObjectOutputStream(new FileOutputStream(file))) {
			ods.writeObject(obj);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static Object loadInFile (File file) {
		try(ObjectInput ois = new ObjectInputStream(new FileInputStream(file))) {
			return ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
