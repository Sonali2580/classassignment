package basicprogram;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String []args)
	{
	int a;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the even or odd numbers");
	a=sc.nextInt();
	if(a%2==0)
		System.out.println(a+ "number is even");
	else
		System.out.println(a+ "number is odd");
	
	}
}
