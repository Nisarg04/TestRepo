package com.test;

public class FinicityChallenge {

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

		//			System.out.println(eval(args[0]));
		System.out.println(eval("gaeb7!!!8jeks5!!!tux10"));
		System.out.println(eval("kem!7!!nej!8ww1!!!!!!5"));
		System.out.println(eval("7!!!8!!!7!!!8!!!7"));
		System.out.println(eval("5!!aaaaaaaaaaaaa!10!5"));
		System.out.println(eval("Aa6!9"));

	}


	public static boolean eval(String arg) {
		char[] input = arg.toCharArray();
		int num1=-1, num2=-1; 	//pair of numbers
		int eCount=0;			//count of exclamation mark
		int previousNumber=-1;

		for(int i=0; i<input.length ; i++) {
			char inputChar = input[i];

			//increase the eCount, if char is '!'
			if ('!' == inputChar) {
				previousNumber=-1;
				eCount++;
			} else if(Character.isDigit(inputChar)) {

				//number produced after appending all the consecutive numbers till current iteration, if any
				previousNumber = Integer.parseInt((previousNumber<0 ? "0" : previousNumber+"" ) + inputChar);

				//check if next char is digit, 
				//if it is digit wait till next iteration to produce new value of previousNumber
				if(!isNextCharDigit(input, i+1)) {
					num2 = num1;
					num1 = previousNumber;
					if(num2<0) {
						//reset eCount for first digit
						eCount=0;
					}else{
						if(num1+num2 == 15) {
							if(eCount==3) {
								//reset count and numbers
								eCount=0;
								num2=-1;
							} else {
								//pair of numbers(num1 and num2) add up to 15,
								//but exclamation count is not 2,
								//hence return false
								return false;
							}
						} else {
							//reset count and numbers
							eCount=0;
							num2=-1;
						}
					}
				}
			} else {
				previousNumber=-1;
			}
		}
		return true;
	}


	private static boolean isNextCharDigit(char[] input, int i) {
		try {
			return Character.isDigit(input[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}
}