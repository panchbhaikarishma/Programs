package basics;

public class Overload_Main 
{
 void main(String a)
{
	System.out.println("1");
	}
 void main(int b)
{
	System.out.println("2");
	}
 void main(char c) 
{
	System.out.println("3");
	}

public static void main(String[] args) 
{
	Overload_Main a1 =new Overload_Main();
	a1.main(100);
	a1.main(100);
	a1.main("Karishma");
	a1.main('k');
	
	
}
}
