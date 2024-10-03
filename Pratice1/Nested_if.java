package Pratice1;

public class Nested_if 
{
public static void main(String[] args) 
{
	int a=10;
	int b=20;
	int c=30;
	
	if(a<b)//true
	{
		if(b>c)
		{
			System.out.println("1");
		}
		else
		{
			if(c<b)
			{
				System.out.println("2");
			}
			else
			{
				System.out.println("4");
			}
		}
	}
	else
	{
		System.out.println("3");
		
	}
}
}
