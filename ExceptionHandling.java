package arrayexamples;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter 1st number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter 2nd number");
		b=sc.nextInt();
		try {
			int c=a/b;//arithmaticException object will throws
			System.out.println(c);
			
		}
		catch(ArithmeticException e) {//all are we used given below for print
			//System.out.println("divide by zero not possible");
			//System.out.println("Exception Occured: "+e);
		//	System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("rest line of code!!");
		System.out.println("=========================");
			
		try {
			String s="abc";
			int i=Integer.parseInt(s);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("string can't be converted as int");
			
		}
		

	}

}
