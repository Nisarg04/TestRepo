package com.test;

public class MagicSquare {
	public static void main(String[] args) {
		int n = 7;
		int[][] square = new int[n][n];
		//		top-right as an origin

		int x=n-1,y=n/2;
		int value = n*n;
		for(int i=1; i<=value ; i++)
		{
			if(square[x][y] == 0){
				square[x][y] = i;	
			}else{
				x=x-2;
				y=y-1;
				square[x][y] = i;
			}
//			find location of next value
			x++; y++;
			if(x>=n && y>=n){x=x-2;y=y-1;}
			else if(x>=n){x=x%n;}
			else if(y>=n){y=y%n;}
		}
		printSquare(square,n);
	}

	private static void printSquare(int[][] square, int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(square[j][i]<=9){
					System.out.print( "0"+square[j][i]+" ");}
				else {System.out.print( square[j][i]+" ");}
			}
			System.out.println("");
		}
	}
}
