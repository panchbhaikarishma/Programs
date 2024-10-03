package basics;
import java.util.Scanner;
public class Scanner_12 
{
	static float pi=3.14f;
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the radius of Circle");
	int r=s1.nextInt();
	float Area=pi*r*r;
	System.out.println("Area of a Circle is=  "+Area);
	s1.close();
}
}
