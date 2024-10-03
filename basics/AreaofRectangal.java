package basics;
import java.util.Scanner;
public class AreaofRectangal 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the Length of Rectangle");
	int l=s1.nextInt();
	System.out.println("Enter the Breath of Rectangle");
	int b=s1.nextInt();
	int Area=l*b;
	System.out.println("Area of Reactangle= "+Area);
	s1.close();
	
}
}
