package Pratice1;

import java.util.Scanner;

public class Pratice 
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Print your name");
	String name=s1.next();
	System.out.println(name);
	System.out.println("Print your surname");
	String surname=s1.next();
	System.out.println(surname);
	System.out.println(surname + " " + name);
	
}
}
