package oopsconcept;

class Parent
{
	void ParentMethod()
	{
		System.out.println("this is Parent class");
		
	}
}
class Child extends Parent
{
	void ChildMethod()
	{
		System.out.println("this is Child class");//inheritance mein child object lena padta taki child parent ko bhi access kar ske
		
	}
}

public class SinleInheritanceDemo {
	public static void main(String[]args)
	{
		Child obj=new Child();
		obj.ParentMethod();
		obj.ChildMethod();
	}

}
