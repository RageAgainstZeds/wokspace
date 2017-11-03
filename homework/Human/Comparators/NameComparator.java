package com.homework.Human.Comparators;

import java.util.Comparator;

import com.homework.Human.Student;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
		return st1.getSurname().compareTo(st2.getSurname());
	}
    
}
