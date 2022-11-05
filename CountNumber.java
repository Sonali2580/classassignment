package basicprogram;
import java.util.Scanner;
public class CountNumber {
	public static void main(String []args)
	{
	int n,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range");
	n=sc.nextInt();
	for(;n!=0;)                 //while(n!=0)
	{
		//incrementing digit count
		count++;
		//remove last digit of n
		n=n/10;
	}
	//display the total digits
	System.out.println("total digits "+count);
	}

}
