package com.homework.Human.Comparators;

import java.util.Comparator;

import com.homework.Human.Student;

public class SurnameConparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getSurname().compareTo(o2.getSurname());
	}		
}
