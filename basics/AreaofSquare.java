package basics;
import java.util.Scanner;
public class AreaofSquare 
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the the value of a");
	int a=s1.nextInt();
	int Area=a*a;
	System.out.println("Area of Square= "+Area);
	s1.close();
}
}
