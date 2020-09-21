package safe_people;

import java.util.Scanner;
import java.lang.Math;

public class SafePeople {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the population of city");
		double n,affected,affecting,not_cured,not_affected;
		int days=0;
		n = sc.nextDouble();
		System.out.println("The total population is"+n);
		affected=Math.ceil(n/6);
		System.out.println("No.of affected "+affected);
		
		do{
			days=days+1;
			//System.out.println("Day:"+days);
			affected=Math.ceil(n/6);
			//System.out.println("No.of affected "+affected);
			not_affected=n-affected;
			//System.out.println("No.of not_affected "+not_affected);
			affecting=affected+10;
			//System.out.println("No.of affecting "+affecting);
			not_cured=affecting-15;
			//System.out.println("No.of not_cured "+not_cured);
			n=not_affected+not_cured;
			//System.out.println("Remaining "+n);
		}while(n>0 && not_cured>0) ;
		System.out.println("No.of days "+days);
		System.out.println("No.of remaining "+n);
		
	}
}
			
			
			
			
			
			
			
			
		