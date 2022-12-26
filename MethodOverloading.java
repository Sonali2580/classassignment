package oopsconcept;
class Calculator
{
	int add(int a,int b)
	{
	return a+b;
	}
	int add(int a,int b,int c)//no semicolon
	{
	return a+b+c;
	}
	double sub(int a, double b)
	{
		return a-b;
		
	}
	double mul(double a, int b)
	{
		return a*b;
		
	}
	float div(float a,float b)
	{
		return a/b;
	}
}


public class MethodOverloading {
	public static void main(String []args)
	{
		Calculator calci=new Calculator();
		System.out.println(calci.add(10,20));
		System.out.println(calci.div(30f,15f));
		System.out.println(calci.mul(2.0,15));
		System.out.println(calci.sub(20,10.0));
				
	}

}
