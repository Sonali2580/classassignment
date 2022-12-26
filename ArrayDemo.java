package arrayexamples;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[]args)
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner (System.in);
		//initialisation
		//compile time
		//arr[0]=2;
		//arr[1]=3;
		//int a[]= {20,45,67,89,12);
		//runtime
		System.out.println("enter 5 elements");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
	
		}
		//to print values
		System.out.println("enter 5 elements");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
	    }
		//for-each loop
		//System.out.println("printing 5 elements using for -each loop");
		//for(int var:arr)
		//{
	//		System.out.println(var);
	//	}
		//trying copy
		
}	
	}

