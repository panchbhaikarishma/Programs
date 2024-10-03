package typesofinheritance;
class University
{
	static void fund()
	{
		System.out.println(1);
	}
	}
class College extends University
{
	static void misleniuos_fee()
	{
		System.out.println(2);
	}
	}
public class College_Student extends College
{
	static void Tution_fee()
	{
		System.out.println(3);
	}
public static void main(String[] args) 
{
	fund();
	Tution_fee();
	Tution_fee();
	
}
}
