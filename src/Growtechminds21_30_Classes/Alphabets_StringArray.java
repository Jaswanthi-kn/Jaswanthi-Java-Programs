package Growtechminds21_30_Classes;

import java.util.Arrays;

public class Alphabets_StringArray {
static int b=0;
	public static void main(String[] args) {
		String name="Manish123";
		char[] c1=name.toCharArray();//
		System.out.println(Arrays.toString(c1));// with array characters in one line
		for(int i=0;i<c1.length;i++)
		{
			boolean a = Character.isAlphabetic(c1[i]);
			//System.out.println(a);
			if(a==true)
			{
				b++;
				
			}
			
		}
		System.out.println("the total number of alphabets are:"+ b);

	}

}
