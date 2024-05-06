package Growtechminds21_30_Classes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string value");
		
		try //if there is no exception , try block will execute
		{
		int number=s1.nextInt();
		String name[]=new String[number];
		 name[0]="Rama123";
		 name[1]="Sita234";
		 name[2]="Laxman55345";
		 name[3]="Bharath636";
		 System.out.println(Arrays.toString(name));
		 System.out.println("No exception");
		}
		catch(InputMismatchException M1) //if there is  exception , catch block will execute
		{
			System.out.println("Handling exception");
		}
		try
		{
	int c=1/0;
	System.out.println(c);
		}
	catch(ArithmeticException A1)
	{
	System.out.println("Handling arithmatic exep");	
	 System.out.println("exception");
	}
}
}
