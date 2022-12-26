package oopsconcept;
class A
{
	public A()
	{
		System.out.println("this is default constructor");
	}
	public A(int a)
	{
		this();//defalut invoke constructor
		System.out.println("the value of a is:"+a);
		
	}
	public A(float b)
	{
		this(10);//parameterized constructor
		System.out.println("the value of b is:"+b);
	}
	
}

public class ThisConstructorDemo {

	public static void main(String[] args) {
		
A obj=new A(6.5f);

	}

}
