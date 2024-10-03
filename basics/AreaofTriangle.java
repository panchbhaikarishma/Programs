package basics;
import java.util.Scanner;
public class AreaofTriangle 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of Height");
	int h=s1.nextInt();
	float Area=0.5f*h*h;
	System.out.println("Area of Triangle="+Area);
	s1.close();
}
}
