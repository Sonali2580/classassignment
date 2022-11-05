package basicprogram;

import java.util.Scanner;

public class FindMaximum {


public static void main(String []args)

{
	int num1,num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two values");
	num1=sc.nextInt();
	num2=sc.nextInt();
	
if(num1>num2)
	System.out.println("maximum"+" " +num1);
else
	System.out.println("maximum" +" "+num2);	
}
}