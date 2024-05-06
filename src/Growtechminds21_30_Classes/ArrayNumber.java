package Growtechminds21_30_Classes;

import java.util.Arrays;

public class ArrayNumber {
static int value;// by creating Global variable for the count 

public static void main(String[] args) {
		int nos[]=new int[4];
		// int value;  //by creating Local variable for the count
		// value=0;
		
		nos[0]=30;
		nos[1]=50;
		nos[2]=20;
		nos[3]=50;
		int givenno=50;
		System.out.println(Arrays.toString(nos));
		for(int i=0;i<nos.length;i++)
		{
	
			if(givenno==nos[i])
					{
				value++;
				System.out.println("number is present in the given array" +i);
					}
			else
			{
				System.out.println("number is not present in the given array" +i);
					}
			
		}
		System.out.println(value);
	}

}
