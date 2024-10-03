package basics;

public class Example 
{
	int a=10;
	static int b=20;
	void man() 
	{
		final double pi=3.14;
		System.out.println(pi);
	}
public static void main(String[] args) 
{
	int z;
	System.out.println(b);
	Example n1=new Example();
	System.out.println(n1.a);
	n1.man();
}
}
