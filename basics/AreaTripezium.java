package basics;
import java.util.Scanner;
public class AreaTripezium 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of L1");
	int L1=s1.nextInt();
	System.out.println("Enter the value of L2");
	int L2=s1.nextInt();
	System.out.println("Enter the value of h");
	int h=s1.nextInt();
	float Area=0.5f*(L1*L2)*h;
	System.out.println("Area of Trapezium=" +Area);
	s1.close();
}
}
