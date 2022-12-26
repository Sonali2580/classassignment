package oopsconcept;
class Person
{
	int id;
	String name,address;
	public Person(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
				
	}
	void display()
	{
		System.out.println("Id: " +id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		
	}
}
class StudentDetails extends Person
{
	float marks;
	public StudentDetails(int id,String name,String address,float marks)
	{
		super(id,name,address);//super constructor
		this.marks=marks;
		
	}
	void getData()
	{
		super.display();
		System.out.println("Marks: "+marks);
		
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		StudentDetails obj=new StudentDetails(1,"Sonali","Pune",23.5f);
		obj.getData();
	
	}

}
