package oopsconcept;

class Bank
{
	int rateOfInterest()
	{
		return 8;
	}
}
class Sbi extends Bank
{
	@Override
	int rateOfInterest()           //overriden method
	{
		return 7;
		
	}
}
class Axis extends Bank
{
	@Override
	int rateOfInterest()
	{
		return 5;
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		//Bank bank;
		Sbi sbi=new Sbi();//bank=new Sbi()
System.out.println("rate of interest: "+sbi.rateOfInterest()+"%");//bank.rateOfInterest
		
		Axis axis=new Axis();//bank=new Axis();
		System.out.println("rate of interest: "+axis.rateOfInterest()+"%");//bank.rateOfInterest

		
		

	}

}
