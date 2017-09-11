package com.laliga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaLiga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		List<String> winner = new ArrayList();
		while(tc > 0){
			
			System.out.print("\nBarcelona ");
			int barcelona = sc.nextInt();
            
			System.out.print("\nMalaga ");
			int malaga = sc.nextInt();
			
			System.out.print("\nRealMadrid ");
            int realmadrid = sc.nextInt();
            
            System.out.print("\nEibar ");
            int eibar = sc.nextInt();
			
            if(realmadrid > eibar){
            	winner.add("RealMadrid");
            	tc--;
            	break;
            }else if(barcelona > malaga){
            	winner.add("Barcelona");
            	tc--;
            	break;
            }else{
            	winner.add("RealMadrid");
            	tc--;
            	break;
            }
		}
		winner.stream().forEach(System.out::println);
	}

}
