package codewithharry;

public class ComapreToMethod
 {

	public static void main(String[] args)
	{
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		String name="What do you know about me";
		System.out.println(s1.compareTo(s2));//0 because both are equal
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"
		System.out.println(s1.compareTo(s4));//-1
		System.out.println(s1.compareTo(s5));//2
		
		//for concat Method
		 String s6=s1.concat(" Sonali ").concat( s3 ).concat(" in java ");
		System.out.println(s6);
		
		//for Contains Method
		System.out.println(name.contains("do"));
		System.out.println(name.contains("What about"));//only continuously manner accept not random;y
		System.out.println(name.contains("Hello"));
	}

 }
//A=65
//B=66
//a=97
//b=98
//check by using ascii code  in compare method