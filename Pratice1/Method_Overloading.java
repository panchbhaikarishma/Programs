package Pratice1;

public class Method_Overloading 
{
	static void add()
	{
System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println("2");
		
	}
	static void add(double b)
	{
		System.out.println("3");
		
	}
	static void add(String name)
	{
		System.out.println("4");
	}
public static void main(String[] args)
{
	add();
	add(12);
	add("Karishma");
	add(2.3);
	
}
}
