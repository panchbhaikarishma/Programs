package basics;

public class Assignment_9 
//static methods
{
	static void add(int a,int b)
	
	{
		int Result1=a+b;
		System.out.println(Result1);
	}
	static void sub(int a,int b) 
	{
		int Result2=a-b;
		System.out.println(Result2);
	}
	static void multi(int a,int b)
	{
		int Result3=(a*b);
		System.out.println(Result3);
		
	}
	 //non static
	void login(String username,String paasword) 
	{
		System.out.println("welcome to Facebbok");
	}
	void Customer(int Customerid,int Customernumber)
	{
		System.out.println("Verification Completed");
	}
	void numbers(float values,int valve) 
	{
		float results=values+valve;
		System.out.println(results);
	}
	//Constructor
	
	Assignment_9(float a,int b)
	{
		float result5=a+b;
		System.out.println(result5);
	}
	Assignment_9(double a)
	{
		System.out.println("Double value");
	}
	Assignment_9(String name)
	{
		System.out.println("Congratlations");
	}
	public static void main(String[] args) 
	{
		add(20,3);
		sub(30,3);
		multi(40,3);
		Assignment_9 n1=new Assignment_9(3.14f,15);
		n1.login("kpanchb","karish123");
		n1.Customer(123456,74820964);
		n1.numbers(0.2f,3);
		Assignment_9 n2=new Assignment_9(3.12);
		Assignment_9 n3=new Assignment_9("Karishma");
		
				
				
	
	}
}
