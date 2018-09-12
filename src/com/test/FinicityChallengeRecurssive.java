package com.test;

public class FinicityChallengeRecurssive {

	/*	
Coding Challenge

    In this coding challenge you will be assessed on your ability to 
    solve problems, the cleanliness of your code, and your testing skills.

The Challenge:  
    Using Java, write a console application that takes a string as a 
    command line parameter, performs the calculation defined below, and 
    writes the output to the console. 
	Include the appropriate unit tests.

For example
    Given the string "gaeb7!!!8jeks5!!!tux10" return true if there are 
    exactly 3 exclamation marks  between every pair of numbers that add up 
    to 15. Otherwise return false.
	(Note: exclamation marks may be separated by other, non-numeric characters) 

See the examples below:
    “gaeb7!!!8jeks5!!!tux10”   => true
    “kem!7!!nej!8ww1!!!!!!5”   => true
    “7!!!8!!!7!!!8!!!7”        => true
    “5!!aaaaaaaaaaaaa!10!5”    => false
    “Aa6!9”                    => false*/


	public static void main(String[] args) {

//		System.out.println(eval("gaeb7!!!8jeks5!!!tux10"));
//		System.out.println(eval("kem!7!!nej!8ww1!!!!!!5"));
		System.out.println(eval("7!!!8!!!7!!!8!!!7"));
//		System.out.println(eval("5!!aaaaaaaaaaaaa!10!5"));
//		System.out.println(eval("Aa6!9"));

	}


	public static boolean eval(String arg) {
		if(countFraction(arg)) {
			return conditionCheck(arg);
		} else {
			return eval(trimmedString(arg));
		}
	}

	//String after removing first fraction
	private static String trimmedString(String arg) {
		String newString = arg;
		return newString;
	}


	private static boolean countFraction(String sub) {
		//return n-1
		//where, n is no. of digits
		//returns true if count is 1
		int count = 0;
		char[] input = sub.toCharArray();
		for(int i=0; i<input.length ; i++) {
			if(Character.isDigit(input[i])) {
				count++;
			}
		}
		return count==2;
	}


	//filters char and gives only required 
	//and remove trailing ! as well
	private static String filterInput(String arg) {
		char[] input = arg.toCharArray();
		char[] output = new char[input.length];
		int j=0;

		for(int i=0; i<input.length ; i++) {
			if(Character.isDigit(input[i]) || '!'==input[i]) {
				output[j++]=input[i];
			}
		}
		
		return new String(output);
	}


	private static boolean conditionCheck(String str) {
		//check if string contain three ! and sum is 15
		// for passed fraction
		int count = 0;
		char[] input = str.toCharArray();
		for(int i=0; i<input.length ; i++) {
			if('!' == input[i]) {
				count++;
			}
		}
		return count==3 && countFraction(str);
	}
}