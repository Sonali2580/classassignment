package basicprogram;
import java.util.Scanner;                       //always use semicolon 
public class ReverseNumber {
	public static void main(String []args)
	{
	int n,rem,reverse=0,temp;
	Scanner sc=new Scanner(System.in);
	//input from user
	System.out.println("enter the number");
	n=sc.nextInt();
	temp=n;                                   //for storing n value
	while(n>0)
	{
		rem=n%10;                          //rem is variable used for hold the remainder
		reverse=reverse*10+rem;
		n=n/10;
	}
	System.out.println("reverse of the "+temp+ "is : " +reverse);
	//for pallindrome program
	if(temp==reverse)
	
	System.out.println(temp+"is a palindrome number");
	
	else
		System.out.println(temp+"is not a palindrome number");

	}

}
