package Basic_programs;
//print the number of Digit of a given number by user

import java.util.Scanner;

public class CountTheDigit {
public static void main(String[] args) {
	//declaring the variable
	int num,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	num=sc.nextInt();//taking a number from user
	if(num==0)
	{
		System.out.println("Number is not valid");
	}
	for(;num>0;)
	{
		count++;//count the digit
		num=num/10;//removing the number
	}
	System.out.println("No. of Digits: "+ count);
}

}
