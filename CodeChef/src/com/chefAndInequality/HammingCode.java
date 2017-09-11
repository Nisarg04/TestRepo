package com.chefAndInequality;

public class HammingCode {

	public static void main(String[] args) {
		HammingCode o = new HammingCode();
		System.out.println(o.hammingDistance(0,15));
		
	}


	public int hammingDistance(int x, int y) {      
		int result=0,i,j,k;
		String a = Integer.toBinaryString(x);
		String b = Integer.toBinaryString(y);
		System.out.println(a);
		System.out.println(b);
		for(i=a.length(),j=b.length(); 
				j>0 && i>0 ;  
				i-- , j--){
			if(a.charAt(i-1) != b.charAt(j-1)){
				result++;
			}
		}
		
		String temp = (a.length() - b.length() > 0) ? a : b;
		k=Math.abs(a.length() - b.length());
		
		for(i=0 ; i<k ; i++){
			if(temp.charAt(i) == '1'){
				result++;
			}
		}
		
		return result;
	}
}
