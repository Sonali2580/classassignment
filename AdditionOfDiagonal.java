package arrayexamples;

import java.util.Scanner;

public class AdditionOfDiagonal {

	public static void main(String[] args) {
		int arr[][],row,col,i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		row=sc.nextInt();
		System.out.println("Enter the column");
		col=sc.nextInt();
		
		arr=new int[row][col];
		System.out.println("Enter elemnts in "+row+ "x"+col+"matrix");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		//to print the values
		System.out.println("elements are: ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
			System.out.print(arr[i][j]+" ");
				
			}
		System.out.println();
		}
		//diagonal 
		System.out.println("diagonal addition is");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
			if(i==j)
				sum=sum+arr[i][j];
				
			}
		}
		System.out.println(sum);//after completeing for loop


	}

}
