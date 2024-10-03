package basics;

public class NonstaticMethod 
{
	void add()
	{
		int a =100;
		int b =20;
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a= 100;
		int b=50;
		int minus= a-b;
		System.out.println(minus);
		
	}
	
	public static void main(String[] args) 
	{
		NonstaticMethod n1=new NonstaticMethod();
		n1.add();
		sub();
	}
}
