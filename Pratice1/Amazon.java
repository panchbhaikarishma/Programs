package Pratice1;

public class Amazon//constructor Overloading
{

	Amazon()
	{
		 System.out.println(1);
	}
	Amazon(int a)
	{
		 System.out.println(2);
	}
	Amazon(double b)
	{
		 System.out.println(3);
	}
public static void main(String[] args) 
{
	Amazon a1=new Amazon();
	Amazon a2=new Amazon(100);
	Amazon a3=new Amazon(2.3);
}
}
