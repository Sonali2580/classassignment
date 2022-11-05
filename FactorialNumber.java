//WAP to calculate factorial number
//input 5 output: 5*3*2*1

package basicprogram;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String []args)
{
	int n,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	
	}
	System.out.println("Factorial Number of"+n+"is "+fact );
	
	
}
}
