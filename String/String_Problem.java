package String;

import java.util.Date;

public class String_Problem 
{
public static void main(String[] args) 
{
	Date d1=new Date();
	System.out.println(d1.getTime());//Epoch converter
	Date d2=new Date(d1.getTime()-(1000*60*60*24*2));//for future date we just add (+)
	System.out.println(d2);
	String Current_time=d2.toString();
	String Year=Current_time.substring(Current_time.length()-4);
	System.out.println(Year);
	String Month=Current_time.substring(4, 8);
	System.out.println(Month);
	String Date=Current_time.substring(8, 10);
	System.out.println(Date);
	String DateFormate1=Date.concat("/").concat(Month).concat("/").concat(Year);
	System.out.println(DateFormate1);
	String DateFormate2=Date.concat("-").concat(Month).concat("-").concat(Year);
	System.out.println(DateFormate2);
	
	
}
}
