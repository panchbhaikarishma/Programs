package Pratice1;

import java.util.Date;

public class Current_time 
{
public static void main(String[] args) 
{
	Date d1=new Date();
	System.out.println(d1.getTime());
	Date d2=new Date(d1.getTime()-(1000*60*60*24*3));
	System.out.println(d2);
	String Current_time=d2.toString();
String year=	Current_time.substring(Current_time.length()-4);
System.out.println(year);
String Month=Current_time.substring(4, 7);
System.out.println(Month);
String date=Current_time.substring(8, 10);
System.out.println(date);
String DateFormate=date.concat("/").concat(Month).concat("/").concat(year);
System.out.println(DateFormate);


}
}
