//Write a program to input basic salary of an employee and calculate its gross salary according to following:

//Basic salary <=10000: HRA=20%,DA=80%
//Basic salary <=20000: HRA=25%,DA=90%
//Basic salary >20000: HRA=30%,DA=95%
//Hra=20%  bs*20/100;
//Gross salary: basic salary+hra+da;

package basicprogram;

import java.util.Scanner;

public class BasicSalary {

	public static void main(String []args)
	{
		int bs,hra=0,da=0,gs;
		Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
bs=sc.nextInt();

if(bs<=10000)
{
	hra=bs*20/100;
	da=bs*80/100;
}
else if(bs<=20000)
{
	hra=bs*25/100;
	da=bs*90/100;
	
}
else if(bs>20000)
{
	hra=bs*30/100;
	da=bs*95/100;
}
       gs=bs+hra+da;
       System.out.println("the gross salary"+gs);
       
}
}
