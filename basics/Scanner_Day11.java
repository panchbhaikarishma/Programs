package basics;
import java.util.Scanner;
public class Scanner_Day11 

{
public static void main(String[] args) 
{
	try (Scanner s1 = new Scanner(System.in)) {
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int Sum=a+b;
		System.out.println("Addition of Two numbers  " + Sum);
	}

		
	
	
	
	
	
}
}
