package com.test;
/*
https://www.hackerrank.com/challenges/diagonal-difference/problem

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is shown below:
1 2 3
4 5 6
9 8 9  

The left-to-right diagonal = 1+5+9=15. 
The right to left diagonal = 3+5+9=17.
Their absolute difference is |15-17|=2.

*/
public class DiagonalDifference {
	public static void main(String[] args) {
		int n=3;
		Integer[][] arr = new Integer[n][n];
		
		arr[0][0] = 11; arr[0][1] = 2; arr[0][2] = 4;
		arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
		arr[2][0] = 10; arr[2][1] = 8; arr[2][2] = -12;
		
		System.out.println(diagonaldifference(arr, n));
		
	}

	private static int diagonaldifference(Integer[][] arr, int n) {
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;
		for(int i=0; i<n ; i++) {
			primaryDiagonalSum += arr[i][i];
			secondaryDiagonalSum  += arr[i][n-i-1];
		}
		return Math.abs(primaryDiagonalSum-secondaryDiagonalSum);
	}
}
