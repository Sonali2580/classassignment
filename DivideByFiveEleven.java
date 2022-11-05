//Write a program to find out given number is divisible by 5 and 11 or not?
//55  its is divisible by 5 and 11
package basicprogram;

import java.util.Scanner;

public class DivideByFiveEleven {
	public static void main(String []args)
	{
		int num1,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num1=sc.nextInt();
		if((num1%5==0)&&(num1%11==0))
			System.out.println("number is divisible");
		else
			System.out.println("number is not divisible");
		
}
}