/*Write a program to search a given element in a string;
Hello good morning;
O
O is present in 4th position else hiven character  not found*/
package arrayexamples;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		String input;
		int i;
		char ch;
		System.out.println("Enter the input to search element");
		
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine();
		System.out.println("enter the character from input");
		ch=sc.next().charAt(0);
		for(  i=0;i<input.length();i++)
		{
			if(input.charAt(i)==ch)
			{
	break;
	
			}
			
	    }
		System.out.println(ch+ "is present at position "+i);

}
}
