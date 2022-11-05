package basicprogram;
import java.util.Scanner;
public class NaturalSum {
	public static void main(String []args)
	{
		int i,n,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range");
		n=sc.nextInt();
		for(i=1;i<=5;i++)
		{
			sum=sum+i;
			//sum=(n*(n+1/2))
		}
		System.out.println("the sum of natural number from 1 to" +n+":"+" "+sum);
		
	}

}
