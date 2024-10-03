package Pratice1;

import java.util.InputMismatchException;

public class Thow_keyword 
{
public static void main(String[] args) throws ArithmeticException,InputMismatchException
{
	if(1==1)
	{
	throw new ArithmeticException();
	}
	else
	{
		throw new InputMismatchException();
	}
	
}
}
