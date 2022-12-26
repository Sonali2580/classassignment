//easy
//transpose of matrix 
/*[1 2 3         [1 4 7
 4 5 6            2 5 8
 7 8 9            3 6 9]*/
//input               output
package arrayexamples;
import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		int arr[][],row,col,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		row=sc.nextInt();
		System.out.println("enter the column");
		col=sc.nextInt();
		arr=new int[row][col]; ///inilitalise 
		System.out.println("Enter the "+row+"elements and "+col+"elemnts matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		//print the matrix
		System.out.println("elements are");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
		
				
			}
			System.out.println();
			
		}
		//print the transpose value
		System.out.println("transpose matrix are");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[j][i]+" ");
		
				
			}
			System.out.println();
		}
	}
}



