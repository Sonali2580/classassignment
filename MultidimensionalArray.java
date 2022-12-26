//very easy

package arrayexamples;
import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int arr[][],row,col,i,j;
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
}

}
