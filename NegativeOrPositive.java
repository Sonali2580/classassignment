package basicprogram;
import java.util.Scanner;

public class NegativeOrPositive {
	public static void main(String []args)
	{
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		num1=sc.nextInt();
	
		if(num1>0)
			System.out.println("the number is positive");
		else
			System.out.println("the number is negative");
		
		
	}

}
