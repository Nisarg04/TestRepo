package com.test;

public class MissingNumber {

	/*
	You are given a sorted array of N integers from 1 to N 
	with one number missing find the missing number. 
	Expected time complexity O(logn)

	Examples:
		Input :arr[] = {1, 3, 4, 5}
		Output : 2
		Input : arr[] = {1, 2, 3, 4, 5, 7, 8}
		Output : 6
	 */		
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
		//	index : {0, 1, 2, 3, 4, 5, 6, 7, 8, 09, 10, 11, 12, 13, 14}
//		int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		System.out.println(findMissing(arr));
//		System.out.println(findMissing(arr1));
	}

	private static int findMissing(int[] ar) {
		
		int l = 0, r = ar.length - 1;
	    while (l <= r) {
	    	int mid = (l + r) / 2;
	    	
	    	// If this is the first element 
	        // which is not index + 1, then 
	        // missing element is mid+1
	    	if(mid == 0 || ar[mid] != mid+1 && ar[mid-1] == mid) {
	    		return mid+1;
	    	}
	    	
	    	// if this is not the first missing 
	        // element search in left side
	    	if(ar[mid] != mid+1)  r = mid - 1;
	    	
	    	// if it follows index+1 property then 
	        // search in right sidex1
	    	else l = mid + 1;
	    	
	    }
	    // if no element is missing
	    return -1;
	}

}
