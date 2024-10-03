package String;

public class String_equalsFunction 
{
	public static void main(String[] args) 
	{
		String a="Karishma";
		String b="Student";
		boolean c =a.equals(b); 
		System.out.println(c);
		
		boolean d =a.equalsIgnoreCase(b); 
		System.out.println(d); 
		String e= b.replaceAll("Student","Panchbhai");
		System.out.println(e);
		
		String name="kb no 2 banglore";
		
	String s1=	name.replaceAll("[a-z]", "");
		System.out.println(s1);
		
		String s2=name.replaceAll("[0-9]","");
			System.out.println(s2);
			String name2="My name is Karishma";
	String s3=name2.replaceAll(" ","");
	System.out.println(s3);
	}

}
