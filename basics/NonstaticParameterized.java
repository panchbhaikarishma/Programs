package basics;

public class NonstaticParameterized 
{
	void add (int a,int b) 
	{
		int sum= a+b;
		System.out.println(sum);
	}
	static void login(String un,String pwd) 
	{
		System.out.println("Registration Completed");
	}
	public static void main(String[] args) 
	{
		NonstaticParameterized n1 =new NonstaticParameterized();
		n1.add(10,20);
		login("kpanchb","Sukhsma123");
	}
}
