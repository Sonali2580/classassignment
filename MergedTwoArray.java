package arrayexamples;

import java.util.Scanner;

public class MergedTwoArray {

	public static void main(String[] args) {
int first[],sec[],third[],i,k,size1,size2;
Scanner sc=new Scanner(System.in);
//initialise the first array

System.out.println("enter the size of the first array");
size1=sc.nextInt();
first=new int[size1];
System.out.println("enter "+size1+"elements in the first array");
for(i=0;i<size1;i++)
{
	first[i]=sc.nextInt();
	

}
//initialise the second array

System.out.println("enter the size of the second array");
size2=sc.nextInt();
sec=new int[size2];
System.out.println("enter "+size2+ "elements in the second array");
for(i=0;i<size2;i++)
{
	sec[i]=sc.nextInt();

}
//initialise the third array
third=new int[size1+size2];
//System.out.println(third.length);
//assign first array into the third array

for(i=0;i<first.length;i++)
{
	third[i]=first[i];
	
}

//assigning I value to K
k=i;

//assign second array to third array

for(i=0;i<size2;i++)
{
	third[k]=sec[i];
	k++;
}
//print the third array after merging

System.out.println("And the result is after merging:");
for(i=0;i<third.length;i++)
{
	
	System.out.print(third[i]+" ");
}
}
}
//dont use semicolon in for loop
