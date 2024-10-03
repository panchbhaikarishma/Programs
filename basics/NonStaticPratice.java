package basics;
public class NonStaticPratice 
{
	void add(int a,int b,int c)
	{
		int Sum= a+b+c;
		System.out.println(Sum);
	}
	
	void add(int a,int b) 
	{
		int Sub=(a-b);
	System.out.println(Sub);
	}
public static void main(String[] args)
{
	NonStaticPratice n1=new NonStaticPratice();
	n1.add(10, 20,10);
	n1.add(10,20);
}
}
