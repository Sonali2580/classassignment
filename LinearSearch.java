package arrayexamples;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	int arr[],i,key,size,pos=-1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of the array");
	size=sc.nextInt();
	//instantiate array
	arr=new int[size];
	//initialize the array
	System.out.println("Enter" +size+ "of the array");
for(i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
	
}

//input for search element
System.out.println("Enter the element you searching for");
key=sc.nextInt();
for(i=0;i<size;i++)
{
	if(arr[i]==key);
	{
		pos=i;
	}
}
if (pos!=-1)                 //like this 

	System.out.println(key+ "found at" +(pos+1)+"position");
	else
		System.out.println("data not found in an array");

//or like this
//if(pos==-1)
//System.out.println("data not found in an array");
//else
//	System.out.println(key+ "found at" +(pos+1)+"position");







	
}

	}


