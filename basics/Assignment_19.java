package basics;
import java.util.Scanner;
public class Assignment_19 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Enter your FirstName ");
	String FirstName=s1.nextLine();
	System.out.println("Enter your LastName ");
	String LastName=s1.nextLine();
	System.out.println("Enter your Emailid");
	String Emailid=s1.nextLine();
	System.out.println("Enter your Password");
	String Password=s1.nextLine();
	System.out.println("Enter your Gender");
	String Gender=s1.nextLine();
	System.out.println("Enter your Present Address");
	String Present_Address=s1.nextLine();
	System.out.println("Enter your Permanant Address");
	String Permanant_Address=s1.nextLine();
	System.out.println("Enter your Pin code");
	int pin=s1.nextInt();
	s1.close();

}
}
