package Assignmentsby_SDETprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1dummy {

	public static void main(String[] args) {
		//public static void main(String[] args) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("enter the value of array size: "); //2
			String name[] = new String[s1.nextInt()];//size of the array
			for (int i = 0; i < name.length; i++) {
				System.out.print("enter the value of array "+i);
				name[i] = s1.next();
				System.out.println((name[i]));
				

			}
			System.out.println(Arrays.toString(name));
			String name1[] = new String[s1.nextInt()];

			for (int i = 0; i < name1.length; i++) {
				System.out.print("enter the value of array "+i);
				name1[i] = s1.next();
				System.out.println((name1[i]));
			}
		
				System.out.println(Arrays.toString(name1));
			System.out.println(Arrays.equals(name, name1));
		if(Arrays.equals(name, name1)==true){
			System.out.println("the string value is true");
			
		}else
		{
			System.out.println("the string value is true");
		}
		}
		

	}


