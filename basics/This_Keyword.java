package basics;

public class This_Keyword
{
	int student_id;
	String name;
	double Salary;
	void student_details(int student_id,String name,double Salary)
	{
		this.name=name;
		this.student_id=student_id;
		this.Salary=Salary;
	}

public static void main(String[] args)
{
	This_Keyword a1=new This_Keyword();
	a1.student_details(100,"Karishma",45965.2);
	
	System.out.println(a1.student_id);
	System.out.println(a1.name);
	System.out.println(a1.Salary);
	
}
}
