package oopsconcept;
class Employee{
	int id;
	String name,designation;
	double basicSalary;
	public Employee(int id,String name,String designation,double basicSalary) ///Employee is constructor
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSalary=basicSalary;
		
	}
	public void display()
	{
		System.out.println("ID: "+id+ " Name: "+name+ " DESIGNATION: "+designation+ " BASIC SALARY: "+basicSalary);
	}
}



public class EmployeeContructor {
	public static void main(String []args) {
		Employee emp1= new Employee(101 ,"rajiv ","Manager ",20000);
		Employee emp2= new Employee(102,"rani","developer",30000);
		emp1.display();
		emp2.display();
	}
	

}
