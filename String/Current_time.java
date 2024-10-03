package String;

import java.util.Date;

public class Current_time 
{
public static void main(String[] args) 
{
	Date d1=new Date();
	System.out.println(d1);
	String Current_time=d1.toString();
	String year=Current_time.substring(Current_time.length()-4);
	System.out.println(year);
	String month=Current_time.substring(4, 7);
	System.out.println(month);
	=
	
	
}
}
