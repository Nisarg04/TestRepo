package com.chefAndInequality;
import java.util.Scanner;
class MainClass1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc>0){
			int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
			long r=0;
			for(int i=a;i<=b;i++){
				int y = Math.max(c, i+1);
				int t = Math.max(d-y+1,0);
				r=r+t;
			}
			System.out.println(r);
			tc--;
		}
		try{
		sc.close();
		}catch(Exception e){
		}
	}
}
