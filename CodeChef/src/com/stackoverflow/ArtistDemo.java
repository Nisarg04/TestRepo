package com.stackoverflow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ArtistDemo {

	public static void main(String[] args) {
		
		Talent t1 = new Talent(1, "sk1");
		Talent t2 = new Talent(2, "sk2");
		Talent t3 = new Talent(3, "sk3");
		List<Talent> tList1 = new ArrayList<>();
		tList1.add(t1);
		tList1.add(t2);
		tList1.add(t3);
		
		Talent t4 = new Talent(4, "sk4");
		Talent t5 = new Talent(5, "sk5");
		Talent t6 = new Talent(6, "sk6");
		List<Talent> tList2 = new ArrayList<>();
		tList2.add(t4);
		tList2.add(t5);
		tList2.add(t6);
		
		Talent t7 = new Talent(7, "sk7");
		Talent t8 = new Talent(8, "sk8");
		Talent t9 = new Talent(9, "sk8");
		List<Talent> tList3 = new ArrayList<>();
		tList3.add(t7);
		tList3.add(t8);
		tList3.add(t9);
		
		Artist a1 = new Artist("a1", "p1", tList1);
		Artist a2 = new Artist("a3", "p2", tList2);
		Artist a3 = new Artist("a3", "p3", tList3);
		
		List<Artist> aList = new ArrayList<>();
		aList.add(a1);
		aList.add(a2);
		aList.add(a3);
		
		aList.forEach(System.out::println);
		Set<String> set = new HashSet<>();
//		aList.collect(groupingBy(i -> i.getName())).values().stream().map(l -> l.get(0));
//		aList.removeIf(p -> set.contains(p.getName()) ? true : !set.add(p.getName()));
		aList.removeIf(p -> {
			if(set.contains(p.getName())){
				return true;
			} else {
				set.add(p.getName());
				return false;
			}
		});
//		List<String> dList = aList.stream().map(o -> o.getName()).distinct().collect(Collectors.toList());
		System.out.println(aList);
		/*int sum = aList.stream()
						.filter(i -> i.getName().equals("a2"))
						.flatMapToInt(i -> i.getTalent().stream().mapToInt(j -> j.getRank()))
						.sum();
		System.out.println(sum);
		
		int sum1 = aList.stream()
						.filter(i -> i.getName().equals("a2"))
						.findFirst()
						.get()
						.getTalent()
						.stream()
						.mapToInt(i -> i.getRank())
						.sum();
		System.out.println(sum1);

		Stream<Object> st = aList.stream().map(i -> i.getTalent());						
		st.forEach(i -> System.out.println(i.getClass().getName()));
		System.out.println(sum);*/
		
		
	}

}
