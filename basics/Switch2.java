package basics;

import java.util.Scanner;

public class Switch2 
{
public static void main(String[] args) 
{
	System.out.println("press 1 for chrome");
	System.out.println("press 2 for Firefox");
	System.out.println("press 3 for IE");
	Scanner s1=new Scanner(System.in);
	int selection=s1.nextInt();
	switch(selection)
	{
	case 1:
		System.out.println("Launch crome broswer");
		break;
	case 2:
		System.out.println("Launch Firefox");
		break;
	case 3:
		System.out.println("Launch IE");
		break;
	default:
		System.out.println("Your selection is wrong");
	}
}
}
