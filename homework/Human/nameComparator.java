package com.homework.Human;

import java.util.Comparator;

public class nameComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
		return st1.getSurname().compareTo(st2.getSurname());
	}
}
