package com.test;

public class UlamsSpiral {
	public static void main(String[] args) {
		int n=7;
		Integer[][] square = new Integer[n][n];
		int x=n/2;
		int y=n/2;
		int value = n*n;
		int dir = 3;

		for(int i=1; i<=value ; i++) {
			if(isPrime(i)) {
				square[x][y]=i;
			} else {
				square[x][y]=-1;
			}
			if(dir==0){
				if(square[x][y-1]==null){
					y=y-1;
					dir=1;
				}else{
					x=x+1;
				}
			}else if(dir==1){
				if(square[x-1][y]==null){
					x=x-1;
					dir=2;
				}else{
					y=y-1;
				}
			}else if(dir==2){
				if(square[x][y+1]==null){
					y=y+1;
					dir=3;
				}else{
					x=x-1;
				}
			}else if(dir==3){
				if(square[x+1][y]==null){
					x=x+1;
					dir=0;
				}else{
					y=y+1;
				}
			}
		}
		printSquare(square,n);
	}

	private static boolean isPrime(int n) {
		int i;
		int m=n/2;    
		for(i=2;i<=m;i++){    
			if(n%i==0){    
				return false;   
			}    
		}    
		return true;
	}
	
	private static void printSquare(Integer[][] square, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(String.valueOf(square[j][i]).matches("[1-9]")) {
					System.out.print( "0"+square[j][i]+" ");
				} else {
					System.out.print(square[j][i]+" ");
				}
			}
			System.out.println("");
		}
	}

}
