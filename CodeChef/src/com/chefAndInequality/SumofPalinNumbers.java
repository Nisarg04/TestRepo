package com.chefAndInequality;

public class SumofPalinNumbers {
	public static void main(String[] args) {

		int result = 0;

		int a=123;
		int b=150;

		for(int i=a;i<=b;i++){
			boolean flag = isPalindrome(i);

			if(flag){
				System.out.println(i);
				result += i;
			}
		}

		System.out.println(result);
	}

	public static boolean isPalindrome(int n)
	{
		int backup = n;
		int reversedNum=0;
		while( n != 0 )
		{
			reversedNum = reversedNum * 10;
			reversedNum = reversedNum + n%10;
			n = n/10;
		}
		if(reversedNum == backup)
			return true;
		else
			return false;
	}
}
