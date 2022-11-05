package basicprogram;
import java.util.Scanner;

public class SimpleInterst {
	public static void main(String[] args)
	{
		float principle,time,rate,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount");
		principle=sc.nextFloat();
		System.out.println("Enter time ");
		time=sc.nextFloat();
		System.out.println("Enter rate");
		rate=sc.nextFloat();
		si=(principle*time*rate)/100;
				System.out.println("Your Simple Interest is"+si);
				
		
	}

}
