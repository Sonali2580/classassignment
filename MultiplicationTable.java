//WAP to print multiplication table:
//5*1=5,5*2=10

package basicprogram;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String []args)
	{
		int i,n,mul=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			mul=n*i;
			System.out.println("the multiplication table of"+n+"*"+i+" "+mul);
			
		}
		}

}
