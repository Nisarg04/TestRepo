package com.stackoverflow;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> map = new LinkedHashMap<>();
		
		LinkedHashMap<String, ArrayList<String>> innerMap = new LinkedHashMap<>();
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		innerMap.put("springRepo", al);
		map.put("nisarg", innerMap);
		
		innerMap = new LinkedHashMap<>();
		innerMap.put("testRepo", al);
		map.put("akash", innerMap);
		System.out.println(map);
		
	}
}
