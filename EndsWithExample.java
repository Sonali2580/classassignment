package codewithharry;

public class EndsWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="Sonali how are you";
		String s1="javascript";
		String s2="javascript";
		String s3="java";
		String s4="JAVASCRIPT";
		System.out.println(name1.endsWith("Sonali"));
		System.out.println(name1.startsWith("Sonali"));
		if(name1.endsWith("you"))
		{
			System.out.println("it ends with you");
			
		}
		else
		
			System.out.println("it not ends with you");
		System.out.println("=======================================");
		
		//Equals method
		System.out.println(s1.equals(s2));//TRUE
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//false because case sensitive
		System.out.println("=======================================");
		
		//EqualsIgnore case method
		System.out.println(s1.equalsIgnoreCase(s2));//TRUE
		System.out.println(s1.equalsIgnoreCase(s3));//false
		System.out.println(s1.equalsIgnoreCase(s4));//true because it ignores case sensitive
		System.out.println("=======================================");
		
		//index of method
		System.out.println(s1.indexOf("a"));//1
		System.out.println(s1.lastIndexOf('a'));//3//but it start counting from starting 0,1,2,3
		System.out.println(s1.indexOf("s", 2));//4
		System.out.println(s1.lastIndexOf('i',10));//7//it start from last character to check where "i" is 
		
		

		System.out.println(s2.isEmpty());
		System.out.println("=======================================");
		
		//replace for single character

		System.out.println(s3.replace('a', 'p'));
		System.out.println(s4.replace("VAS", "run"));//for multiple charater
		System.out.println("=======================================");
		
	//	converting integer to string
int i=10;
String s=String.valueOf(i);
System.out.println(s);
	}
	
	

}
