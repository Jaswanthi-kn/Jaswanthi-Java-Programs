package Assignmentsby_SDETprograms;

import java.util.Scanner;

public class String_Practice1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String name="Java Program";
		String name1="MKT software testing";
		System.out.println(name.length());
		System.out.println(name1.length());
		name.charAt(0);
		name1.charAt(2);
		System.out.println(name.charAt(0) );
		System.out.println(name1.charAt(8));
		name.indexOf('P');
		System.out.println(name.indexOf('P'));
		System.out.println(name1.indexOf('t'));

	}

}
