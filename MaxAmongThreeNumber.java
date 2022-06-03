//find out maximum number among three digits
//x=20 y=1 z=100 max=100

package Basic_programs;
import java.util.Scanner;

public class MaxAmongThreeNumber {

	public void findMax(int x,int y,int z)
	{
	if (x>y)
	{
		if (x>z)
		{
			System.out.println("x is greter");
		}
		else
		{
			System.out.println("z is greater");
		}
	}
	else 
	{
		if (y>z)
		{
			System.out.println("y is greter");
		}
		else
		{
			System.out.println("z is greter");
		}
			
		
	}
	}
		public static void main(String [] args) 
		{
			//declare variables
			int x,y,z;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter three numbers: ");
			x=sc.nextInt();//taking the number from user
			y=sc.nextInt();//taking the number from user
			z=sc.nextInt();//taking the number from user
			
			//object creation/class instantiation
			//MaxAmongTwoNumber obj=new MaxAmongTwoNumber();
			//obj.findMax();
	
			//need rectification
	}
}
