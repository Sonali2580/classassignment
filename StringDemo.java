package arrayexamples;

public class StringDemo {

	public static void main(String[] args) {
		//using literal which is immutable// it is true
	String str1="Sonali";
	String str2="Sonali";
	System.out.println(str1==str2);
	//using new keyword which is not immutable//it is false
	String s=new String("Mule");
	String s1=new String("Mule");
	System.out.println(s==s1);
	}

}
