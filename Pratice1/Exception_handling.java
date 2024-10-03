package Pratice1;

public class Exception_handling
{
public static void main(String[] args)
{
	try
	{
		int a =1/0;
		System.out.println(a);
	}
	catch(ArithmeticException a1)
	{
		System.out.println("Sorry there is blocker");
	}
}
}
