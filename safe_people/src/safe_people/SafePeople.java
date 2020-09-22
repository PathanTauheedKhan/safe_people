package safe_people;

import java.util.Scanner;
import java.lang.Math;

public class SafePeople {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the population of city");
		double n,affected,remaining;
		int days=0;
		n = sc.nextDouble();
		System.out.println("The total population is"+n);
		affected=Math.ceil(n/6);
		System.out.println("No.of affected already "+affected);//
		remaining=n-affected;
		while(affected>0)
		{
			days=days+1;
			affected=affected+10-15;
			//affected=affected-15;
			remaining=remaining-10;
			
			
		}
		System.out.println("No.of days "+days);
		if(n>0) {
			System.out.println("No.of remaining is"+remaining);
			
		}
		else {
			System.out.println("no.of remaining is 0");
		}
		
		
	}
}
			
			
			
			
			
			
			
			
		