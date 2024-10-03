package basics;

public class StaticParameterized 
{
	static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		add(100,20);
	}
}
