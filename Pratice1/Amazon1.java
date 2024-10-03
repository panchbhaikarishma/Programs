package Pratice1;

public class Amazon1 //This calling statement
{
	Amazon1()
	{
		this("Karishma");
		System.out.println(1);
	}
	Amazon1(String name)
	{
		this(100);
		System.out.println(2);
	}
	Amazon1(int a)
	{
		System.out.println(3);
	}
public static void main(String[] args) 
{
	Amazon1 a1=new Amazon1();
}
}
