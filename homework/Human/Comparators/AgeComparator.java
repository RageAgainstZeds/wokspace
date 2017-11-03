package com.homework.Human.Comparators;

import java.util.Comparator;
import com.homework.Human.Student;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.getAge() > o2.getAge()) {
			return 1;
		} else if (o1.getAge() < o2.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}
		
}
