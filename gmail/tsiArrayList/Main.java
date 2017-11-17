package com.gmail.tsiArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(8);
		listInt.add(8);
		listInt.add(14);
		
		//System.out.println(listInt);
		listInt.add(0, 9);
		//System.out.println(listInt);
		listInt.set(3, 1488);
		//System.out.println(listInt);
		
		//System.out.println(listInt.get(3));
		listInt.remove(0);
		//System.out.println(listInt);
		//System.out.println(listInt.size());
		//listInt.clear();
		//System.out.println(listInt);
		
		/*for (Integer integer : listInt) {
			System.out.println(integer);
		}*/
		
		Iterator<Integer> it = listInt.iterator();
		
		for (;it.hasNext();) {
			int c = it.next();
			if (c%2==0) {
				it.remove();
			}
			System.out.println(c);
		}
		System.out.println(listInt);
		
	}

}
