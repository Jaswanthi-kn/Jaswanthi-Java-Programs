package Strings_Arrays_Practice;

import java.util.Arrays;

public class Fourthclass1_program1 
{
	//lets count the numeric values from the given string
	static int count_numeric=0;
	static int count_alphabets=0;
	public static void main(String[] args) 
	{
      String name="Manish12345";
      char[] s1=name.toCharArray();
      System.out.println(Arrays.toString(s1));
      for(int i=0;i<s1.length;i++)
      {
    	boolean F1= Character.isDigit(s1[i]);
    	count_numeric++;
    	
        
        boolean F2= Character.isAlphabetic(s1[i]);
      	count_alphabets++;
      	
        System.out.println(count_alphabets);
    	System.out.println(count_numeric);

	}
      }
	}

