package Array;

import java.util.Arrays;

public class Assigning_arrayinto_another
{
public static void main(String[] args) 
{
	int array1[]=new int[4];
	array1[0]=85;
	array1[1]=95;
	array1[2]=75;
	array1[3]=65;
	int array2[]=new int [4];
	for(int i=0,k=3;i<array1.length;i++)
	{
		array2[k]=array1[i];
		k--;
	}
	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(array2));
	
}
}
