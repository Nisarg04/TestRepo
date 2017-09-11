package com.chefAndInequality;

public class InBetweenProblem {
	public static void main(String[] args) {
		
		int[][] a = new int[4][4];
		int loop=1;
		int i=0,j=0;

		while(loop<=16)
		{
			if(i==3)
			{
				a[i][j]=loop;
				i=j+1;
				j=3;
			}
			else if(j==0)
			{
				a[i][j]=loop;
				j=i+1;
				i=0;
			}
			
			else
			{
				a[i][j]=loop;
				i++;
				j--;
			}

			loop++;
		}
		printMyData(a);
	}


	private static void printMyData(int[][] a) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(a[j][i]<=9)
				System.out.print("0" + a[j][i] + " ");
				else
					System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}
}
