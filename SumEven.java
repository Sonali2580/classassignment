//WAP to calculate sum of all even numbers from 1 to n
package basicprogram;

import java.util.Scanner;

public class SumEven {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		int  i,n,sum=0;
		System.out.println("enter the value");
		n=sc.nextInt();
	
		for(i=0;i<=n;i++)
		{
		if((i%2)==0)
			sum+=i;
		}
		System.out.println("the sum of even numbers from 1 to"+ n+ "="+sum );
	}

}
