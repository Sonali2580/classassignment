package arrayexamples;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		String input;
		int count=0;
		char ch;
		System.out.println("Enter the input to check it is vowel or not");
		
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine();
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			if((ch=='A'||ch=='a')||(ch=='E'||ch=='e')||(ch=='I'||ch=='i')||(ch=='O'||ch=='o')||(ch=='U'||ch=='u'))
			{
			count++;
			}
		}
		System.out.println("the count of vowels of given input "+count);
		

	}

}
