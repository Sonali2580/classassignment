package oopsconcept;
class User
{
	int userId;
	String username,password,firstName,lastName,address;
	long phno;
	
	public User(int userId,String firstName,String lastName)
	{
		this.userId=userId;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public User(int userId,String firstName,String lastName,String address,long phno)
	{
		this(userId, firstName, lastName);
		this.address=address;
		this.phno=phno;	
	}
	public User(int userId,String firstName,String lastName,String address,long phno,String username,String password)
	{
		this(userId,firstName, lastName,address,phno);
		this.username=username;
		this.password=password;
	}
	
	public int getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public long getPhno() {
		return phno;
	}
	//
	//
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		User user1=new User(1,"Sonali","mule","Mumbai",91305461,"sona","s123");
		System.out.println("Id: "+user1.getUserId());
		System.out.println("FirstName: "+user1.getFirstName());
		System.out.println("LastName: "+user1.getLastName());
		System.out.println("Address: "+user1.getAddress());
		System.out.println("Contact no: "+user1.getPhno());
		System.out.println("Username: "+user1.getUsername());
		System.out.println("LastName: "+user1.getPassword());
		
		System.out.println("================================================");
		User user2=new User (2,"Pari","Sone","Pune",5778768);
		System.out.println("ID: "+user2.getUserId()+"\nFirstName: "+user2.getFirstName()+"\nLastName: "+user2.getLastName()+"\nAddress: "+user2.getAddress()+
				"\nContant No: "+user2.getPhno());
	}

}
