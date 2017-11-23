package com.gmail.tsjMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Map<String, Car> carMap = new HashMap<>();
		
		Car m1 = new Car("Red", 1500, 1999, "CD111");		
		Car m2 = new Car("Blue", 2111, 2001, "FU1488"); 
		Car m3 = new Car("Black", 2400, 2011, "BB1231"); 
				
		/*System.out.println(m2);
		System.out.println(m1);
		*/
		
		carMap.put(m1.getRegCrad(), m1);
		carMap.put(m2.getRegCrad(), m2);
		carMap.put(m3.getRegCrad(), m3);
		
		
		System.out.println(carMap);
		
		Car findCar = carMap.get("FG3456");
		System.out.println(findCar);
		
		Set<String> keys = carMap.keySet();
		
		for (String key : keys) {
			System.out.println(key + " -> " + carMap.get(key));
		}
		
		carMap.remove("BB1231");
		
		for (String key : keys) {
			System.out.println(key + " -> " + carMap.get(key));
		}
		
		/* ------------------------------------------------------- */
		
		//int[] array = generateArray(100);
		//counter(array);
		Integer[] arrayObj = generateArray(100000);
		
		Map<Integer, Integer> mapList = trueCounterGemeric(arrayObj);
		
		Set<Integer> keySs = mapList.keySet();
		for (Integer key : keySs) {
			System.out.println(key + "->> " + mapList.get(key));
		}
		
		Map<Integer, Integer> myChaos = trueCounterGemeric(arrayObj);
		Set<Integer> chaosList = myChaos.keySet();
		for (Integer key : chaosList) {
			System.out.println(key + " ->>> " + myChaos.get(key));
		}
		
		
		
	}
	
	public static Integer[] generateArray(int size) {
		if (size < 0) {
			throw new IllegalAccessError();
		}
		Integer[] arr = new Integer[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}	
		return arr;
	}
	
	// my shit
	public static <T> Map<T, Integer> myCounter(T[] arr) {
		Map<T, Integer> mappi = new HashMap<>();
		for (T i : arr) {
			if (mappi.containsKey(i)) {
				mappi.put(i, mappi.get(i)+1);
			} else {
				mappi.put(i, 0);
			}
		}
		return mappi;
		//System.out.println(mappi);
	}
	
	//teachers shit
	public static Map<Integer, Integer> trueCounter(int[] arr) {
		Map<Integer, Integer> mappi = new HashMap<>();
		for (int i : arr) {
			Integer count = mappi.get(i);
			if (count == 0) {
				mappi.put(i, 1);
			} else {
				mappi.put(i, count + 1);
			}
		}
		return mappi;
	}
	
	//teachers shit
		public static <T>  Map<T, Integer> trueCounterGemeric(T[] arr) {
			Map<T, Integer> mappi = new HashMap<>();
			for (T i : arr) {
				Integer count = mappi.get(i);
				//System.out.println(count);
				if (count == null) {
					mappi.put(i, 1);
				} else {
					mappi.put(i, count + 1);
				}
			}
			return mappi;
		}
	
	
	
}