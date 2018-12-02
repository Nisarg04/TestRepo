package com.junk;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Start");
		String str= "sample program java program the occurences the java program";
        String[] inputstr = str.split(" ");
        
        
        Map<String, Long> countMap = Arrays.stream(inputstr)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        
        Map<String, List<String>> collect = Arrays.stream(inputstr)
        		.collect(Collectors.groupingBy(Object::toString));
        
        System.out.println("== RESULT in feature branch ==");
        System.out.println(collect);
        System.out.println(countMap);
	}

}
