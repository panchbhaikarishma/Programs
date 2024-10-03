package Pratice1;

import java.util.Scanner;

public class Circumferanceof_circle 
{
	static float pi=3.14f;
	public static void main(String[] args)
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("Please enter value of r");
	int r=s1.nextInt();
	float Areaofcircumferance=2*pi*r;
	System.out.println("The Area of circumference->" +Areaofcircumferance);
	
	s1.close();
	
}
}
