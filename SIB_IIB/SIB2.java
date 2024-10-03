package SIB_IIB;

public class SIB2 
{
	static
	{
		System.out.println(1);
	}
	static
	{
		System.out.println(2);
	}
	static
	{
		System.out.println(3);
	}
	{
		System.out.println(4);
	}
	SIB2()
	{
		System.out.println(5);
	}
public static void main(String[] args) 
{
	System.out.println("Main method");
	SIB2 s1=new SIB2();
	
}
}
