package arrayexamples;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		StringBuilder str= new StringBuilder("java ");
	str.append("fire");
		System.out.println(str);
	System.out.println(str.capacity());//default capacity is 16 //java fire included 21
	str.replace(1,3,"run");
	System.out.println(str);
	str.insert(18,"independent");
	System.out.println(str);
	//buffer example

	StringBuffer buffer=new StringBuffer("Welcome");
	System.out.println(buffer+" "+buffer.capacity());
	buffer.append("to the world of java!!");
	System.out.println(buffer+" "+buffer.capacity());
	buffer.deleteCharAt(5);
	System.out.println(buffer);
	//buffer reverse();
	buffer.setCharAt(5, 'm');
	System.out.println(buffer);
	String subString=buffer.substring(8);
	System.out.println(subString);
	String ss=buffer.substring(13,19);
	System.out.println(ss);
	

	}

}
