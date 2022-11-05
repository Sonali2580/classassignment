package basicprogram;

public class VowelOrConsonant {
	public static void main(String []args)
	{
		char ch='4';
		if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
	System.out.println(ch+ "it is vowel");
		else if((ch>=48)||(ch<=57))
			System.out.println(ch+ "it is consonant");
		else
			System.out.println(ch+ "it is conso");
	}

}
//A=65 B=66
//a=97 b=98
//0=48 1=49 2=50 3=51
//char ch='a';
//int unicode=ch;
//System.out.println("the ascii of a is"+unicode);.........for ascii calculation

//Not operator