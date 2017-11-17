package com.gmail.tsh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> genOne	= new GenericClass<>(100);
		
		genOne.setPole(113);
		
		System.out.println(genOne);
		
		Integer [] intList = new Integer[] {5, 0, 3, -4};
		Integer minOne = genMin(intList);
		System.out.println(minOne);
		
		String [] strList = new String[] {"F", "B", "T"};
		String minStr = genMin(strList);
		System.out.println(minStr);
	}
	
	public static <T extends Comparable<T>> T genMin(T[] array) {
		T min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(min) < 0) {
				min = array[i];
			}
		}
		return min;
	}

}
