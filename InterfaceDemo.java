package oopsconcept;

interface MyInterface
{
	public void method1();
	int x=200;
	static int cube(int x)
	{
		return x*x*x;
	}
	//this method is accessible only within this interface and cannot be accessed.
	//or inherited from an interface to another interface
	private void add(int a,int b)
	{
		System.out.println("Addition: "+(a+b));
		
	}
	private void sub(int a,int b)
	{
		System.out.println("Substraction: "+(a-b));
	}
	default void fun()//default method
	{
		System.out.println("We can add method body in interface using default");
		add(10,20);
		sub(40,20);
		}
	
}
class test
{
	int id;
	test(int id)
	{
		this.id=id;
		
	}
	void getValue()
	{
		System.out.println(id);
		
	}
	
}
interface Drawable extends MyInterface

{
public void draw();
//public void method1();
int x=100;
}
interface AA
{
	static String draw()
	{
		return "Drawing Something";
		
	}
	//public int draw();//return type of method is different here->can't implement
	//public void draw();
	int x=500;
	
}
class demo extends test implements Drawable,AA // a class can implement any no. of interface
{
	demo(int id)
	{
		super(id);
	}
	@Override
	public void method1()
	{
		System.out.println("Overridden method of interface");
		//x=22;//can't reassigned as x is final variable
	}
	@ Override 
	public void draw()
	{
		System.out.println("Drawing Circle");
		
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		demo obj=new demo(50); //up casting
		//MyInterface obj=new demo(); //this can only access method1()
		obj.method1();
		//obj.draw();
		obj.getValue();
		obj.fun();
		System.out.println("Cjube: "+MyInterface.cube(5));
		System.out.println(AA.draw());
		//System.out.println(AA.x);//500
		//System.out.println(Drawable.x);//100
		//System.out.println(MyInterface.x);//200
		

	}

}
