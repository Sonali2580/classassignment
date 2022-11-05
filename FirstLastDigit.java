//WAP to find out first and last digit from a number.
//input: 33456 output: first digit: 3 last digit:6
package basicprogram;

import java.util.Scanner;

public class FirstLastDigit {
public static void main(String []args)
{
	int n,last;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	
	last=n%10;
	while(n>10)
	{
		n=n/10;
	}
	System.out.println("the first digit and last digit of given number is "+n+" "+"and"+" "+last);
	
}
	
}
