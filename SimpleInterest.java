package Basic_programs;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String [] args)
	{
		//declaring the variables
		float p,t,r;
		double si;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		p=sc.nextFloat();//Enter principal amount by user
		System.out.println("Enter Time:");
		t=sc.nextFloat();//Enter time by user
		System.out.println("Enter Rate:");
		r=sc.nextFloat();//Enter rate by user
		
		si=p*t*r/100;//Calculating simple interest
		System.out.println("the simple interest is: "+ si);
		sc.close();
		
		
	}

}
