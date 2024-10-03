package basics;
import java.util.Scanner;
public class CircumferanceOfCicle 
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value if PI");
	float pi=s1.nextFloat();
	System.out.println("Enter the value of Radius");
	int r=s1.nextInt();
	float Circumferance= 2*pi*r;
	System.out.println("The Circumferance of Circle is " +Circumferance);
	s1.close();
}
}
