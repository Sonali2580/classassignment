package basicprogram;
import java.util.Scanner;

public class TotalMarks {
	public static void main(String []args)
	{
	float eng,math,sci,hindi,phy,totalmark,avg,percent;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter marks of eng");
	eng=sc.nextFloat();
	System.out.println("enter marks of math");
	math=sc.nextFloat();
	System.out.println("enter marks of sci");
	sci=sc.nextFloat();
	System.out.println("enter marks of hindi");
	hindi=sc.nextFloat();
	System.out.println("enter marks of phy");
	phy=sc.nextFloat();
	totalmark=(eng+math+sci+hindi+phy);
	System.out.println("total marks of five subject:"+totalmark);
	avg=totalmark/5;
	System.out.println("Average marks of five subject:"+avg);
	percent=(totalmark/500)*100;
	System.out.println("Percent marks of five subject:"+percent);

	
	
	
	}

}
