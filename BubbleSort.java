package arrayexamples;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]=new int[10],i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 elements in an array");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		//sorting
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				/*swap if currently selected element is not at its current position*/
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
			}
		}
			//external
			System.out.println("\n After sorting in ascending order ,value are:");
			for(i=0;i<10;i++)
			{
				System.out.println(arr[i]+" ");
				
			}
		}


	}
//it is for ascending order or descending order


