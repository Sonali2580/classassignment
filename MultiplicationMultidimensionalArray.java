package arrayexamples;

import java.util.Scanner;

public class MultiplicationMultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][],b[][],c[][],row,col,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		row=sc.nextInt();
		System.out.println("Enter the column");
		col=sc.nextInt();
		
		a=new int[row][col];
	
		
		System.out.println("Enter elemnts in "+row+ "x"+col+"matrix");
		//for 1st matrix
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				
				a[i][j]=sc.nextInt();
			}
		}
		//1st matrix print
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//for 2nd matrix
		b=new int[row][col];
		System.out.println("Enter elemnts in "+row+ "x"+col+"matrix");

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
		
				b[i][j]=sc.nextInt();
			}
			
		}
		//2nd matrix print
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				
				System.out.print(b[i][j]+" ");
			}
			System.out.println();

		}
		//
		//to print 3rd matrix ,the values are
				c=new int[row][col];
				System.out.println("elements are: ");
				for(i=0;i<row;i++)
				{
					for(j=0;j<col;j++)
					{
						
						c[i][j]=a[i][j]*b[j][i];
					System.out.print(c[i][j]+" ");
						
					}
				System.out.println();
				}

		
	}

}
