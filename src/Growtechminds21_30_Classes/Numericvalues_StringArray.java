package Growtechminds21_30_Classes;

import java.util.Arrays;

public class Numericvalues_StringArray {
static int numericvalue=0;
	public static void main(String[] args) {
		String name="jaswanthi123";
		char[] s1=name.toCharArray();
		System.out.println(Arrays.toString(s1));
		//boolean name1=Character.isAlphabetic(s1[0]);
		//System.out.println(name1);
		for(int i=0;i<=s1.length;i++)
		{
			boolean name1=Character.isAlphabetic(s1[i]);
			numericvalue++;
			if(name1==true)
			{
				
				System.out.println("it is a alphabetic");
			}
			else
			{
				System.out.println("it is not a alphabetic");
			}
		}

	}

}
