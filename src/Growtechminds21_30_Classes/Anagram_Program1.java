package Growtechminds21_30_Classes;

import java.util.Arrays;

public class Anagram_Program1 {

	public static void main(String[] args) {
		String input1="ram"; // case sensitive
		String input2="amrwe";
		if(input1.length()!=input2.length()) // not operator first
		{
			System.out.println("this is not an anagram");
		}
		else
		{
			System.out.println("this is an anagram");
		}
		char[] c1=input1.toCharArray();
		char[] c2=input2.toCharArray();
		System.out.println("before sorting");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		if(Arrays.equals(c1, c2)==true)
		{
			System.out.println("they are an anagram");
		}
		else
			System.out.println("they are not an anagram");
				

	
	}
}

