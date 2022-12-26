package arrayexamples;

import java.util.Scanner;

public class LinearSearch_2 {
static Scanner sc=new Scanner(System.in);
	
	public static void searchElement(int arr[],int key)
	{
		int i;
     	boolean flag=false;
		for(i=0;i<arr.length;i++)  //i=4<10 t
		{
		if(arr[i]==key)   //arr[4] =23 == 23t
		{
//		pos=i;  //pos=4
		//break;
			flag=true;
			System.out.println(key+ " found at "+(i+1)+" position");
			break;
		}
		}

		if(flag==false)
			System.out.println("data not found in an array!");
	}
	
	
	public static int[] setArray()
	{
      int arr[],size,i;
		
		
		System.out.println("Enter Size of array:");
		size=sc.nextInt(); //5
		
		//instantiate array
		arr=new int[size];
		
		//initialize the array
		System.out.println("Enter "+size+" elements in an array!!");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[]=setArray();
		
		//input for search element
		System.out.println("enter element you want to searching for!!");
		int key=sc.nextInt();
		
		searchElement(arr, key);
		


	}

}

	

	


