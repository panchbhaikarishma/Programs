package basics;
abstract class One
{
	abstract void Login_Logic();
	
	static void add()
	{
		System.out.println("Concrete method");
	}
	
	}


public class Concrete_class extends One
{
	void Login_Logic() 
	{
		
		System.out.println("Login Logic will be here");
	} 
	public static void main(String[] args) 
	{
		add();
		Concrete_class n1=new Concrete_class();
		n1.Login_Logic();
		
		
	}

	
	
}
