package com.test;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Barcodes {

    public static void main(String[] args) {
    	List<String> list = new ArrayList<String>();
        list.add("Krishna");
        list.add("Krishna");
        list.add("Kishan");
        list.add("Kishan");
        list.add("Aryan");
        list.add("Harm");
        
       list = list.stream().distinct().collect(Collectors.toList());
       System.out.println(list);
    }
    
}
