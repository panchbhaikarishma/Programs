package basics;

public class Overload_mainmethod 
{
	public void main(int a)
	{
		System.out.println(1);
	}
	public void main(char b)
	{
		System.out.println(2);
	}
	public void main(String c)
	{
		System.out.println(3);
	}
public static void main(String[] args) 
{
	Overload_mainmethod O1= new Overload_mainmethod();
	O1.main(100);
	O1.main('K');
	O1.main("Karishma");
	
}
}
