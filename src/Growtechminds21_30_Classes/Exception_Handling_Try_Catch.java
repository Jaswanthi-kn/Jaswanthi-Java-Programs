package Growtechminds21_30_Classes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling_Try_Catch {
	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string value");
		
		try //if there is no exception , try block will execute
		{
		int number=s1.nextInt();
		String name[]=new String[number];
		 name[0]="Rama";
		 name[1]="Sita";
		 name[2]="Laxman";
		 name[3]="Bharath";
		 System.out.println(Arrays.toString(name));
		}
		catch(InputMismatchException M1) //if there is  exception , catch block will execute
		{
			System.out.println("Handling exception");
		}
catch(ArrayIndexOutOfBoundsException A1)
		{
	System.out.println("Handling exception 1");
		}
	}

}
