package Strings_Arrays_Practice;

import java.util.Arrays;

public class Anagram_Programs {

	public static void main(String[] args) {
		String Anna1="bread";
		String Anna2="blarppd";//beard
	char[] a1=Anna1.toCharArray();
	System.out.println(Arrays.toString(a1));
	char[] a2=Anna2.toCharArray();
	System.out.println(Arrays.toString(a2));
	Arrays.sort(a1);
	Arrays.sort(a2);
	System.out.println(Arrays.toString(a1));
	System.out.println(Arrays.toString(a2));
	if(Arrays.equals(a1, a2)==true)
	{
		System.out.println("it is a anagram");
	}
	else
		System.out.println("it is not a anagram");
	}

	}


