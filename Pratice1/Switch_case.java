package Pratice1;

import java.util.Scanner;

public class Switch_case 
{

public static void main(String[] args) 
{
	System.out.println("Press 1 for crome");
	System.out.println("Press 2 for Google");
	System.out.println("Press 3 for Facebook");
	System.out.println("Press 4 for Instagram");
	Scanner s1=new Scanner(System.in);
	int a=s1.nextInt();
	switch(a)
	{
	case 1: 
		System.out.println("Open crome browser");
		break;
	
	case 2:
		System.out.println("Open Google browser");
		break;
	
	case 3:
		System.out.println("Open Facebook browser");
		break;
	case 4:
		System.out.println("Open Instagram browser");
		break;
		
	default:
		System.out.println("Sorry input is wrong");
		s1.close();
	
	}
	
	
}
}
