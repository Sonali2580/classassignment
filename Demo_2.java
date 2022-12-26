package oopsconcept;

import java.util.Scanner;
class Student
{
	int id;
	String name,address,course;
	float fees;
	void setData(int i,String n,String add,String c,float f)//parameter are local variable
	{
		id=i;
		name=n;
		address=add;
		course=c;
		fees=f;
	}
	void displayData()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Course:"+course);
		System.out.println("Fees:"+fees);
	}
}
public class Demo_2 {

	public static void main(String[] args) {
		Student nikhil=new Student();
		//for user input
		int id,n;
		 String name,address,course;
		  float fees;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter number of student you want to enter:");
		  n=sc.nextInt();
		  for(int i=1;i<=n;i++)
			  
		  System.out.println("===============================");
		  System.out.println("enter id");
		  id=sc.nextInt();
		  sc.nextLine() ;                         //to consume delimeter 
		  System.out.println("enter name");
		  name=sc.nextLine();
		  System.out.println("enter address");
		  address=sc.nextLine();
		  System.out.println("enter course");
		  course=sc.nextLine();
		  System.out.println("enter fees");
		  fees=sc.nextFloat();
		  Student obj=new Student();
		  obj.setData(id,name,address,course,fees);
		  System.out.println("=================");
		 obj.displayData();

		 
		//nikhil.id=101;           //
		//nikhil.name="nikhil;
		//nikhil.address="mumbai;
		//nikhil.course="java";
		//nikhil.fees=2000.0f;
		//nikhil.setData(101,"nikhil","mumbai","java full stack",2000.0f);//calling invoke method
		/*nikhil.displayData();
		System.out.println("=======================");
		Student akansha=new Student();
		akansha.setData(102,"akansha","pune","aws",1000.0f);
		akansha.displayData();*/

		

	}

}
