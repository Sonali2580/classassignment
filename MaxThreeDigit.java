package basicprogram;
import java.util.Scanner;
public class MaxThreeDigit {
	public static void main(String []args)
	{
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
	if(num1>num2)//external if
	{
		if(num1>num3)//internal if
		{
		System.out.println(num1+"is greater");
		
		}//internal if
		else
		{
			System.out.println(num3+ "is greater");
		}
	}//external if
		else//external else
		{
			if(num2>num3)//internal if
			{
				System.out.println(num2+ "is greater");
			}
			else//internal else
			{
				System.out.println(num3+ "is greater");
			}
		}//external else
		
	
				
	}

}
