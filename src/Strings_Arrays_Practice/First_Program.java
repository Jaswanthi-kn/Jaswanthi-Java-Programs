package Strings_Arrays_Practice;

public class First_Program {
	static String name01="Divya";
	public static void main(String[] args) {
		String name="Aarnav Girish";
		System.out.println(name.length()); //total length of the string - positions starts at 1 to 9
		System.out.println(name.charAt(8));//we need to give index and will get the char as a output - indexing start from 0 to 8
		String name1="Jaswanthi KN";
		System.out.println(name1.indexOf('s'));// indexof(int char)means we need to give char as input and output will get index position
		//	System.out.println(name1.indexOf('K'));
		System.out.println(name1.toUpperCase());// toUppercase() will print total string into Uppercase letters
		System.out.println(name1.toLowerCase());//toLowecase() will print total string into lowecase letters
		String name11="This is the Automation Batch 41";
		System.out.println(name11.toUpperCase());
		System.out.println(name11.toLowerCase());
		String name12="Bhargavi";
		System.out.println(name12.concat(" Jaswanthi is my lovely sister"));//concat means it will combine 2 or more strings
		String name13= "Vijay Sai";
		System.out.println(name11 .concat(name12).  concat(name13). concat(name1).concat(name));
		System.out.println(name12.concat(" ").concat(name13)); //concat(" ")we can use or + also we can use
		String First_Name="Iam Jaswanthi";
		String Last_Name="Iam Bhargavi";
		System.out.println(First_Name.concat(Last_Name));
		System.out.println(First_Name.concat(" ").concat(Last_Name));
		String name22="Growtechminds";
		System.out.println(name22.contains("minGws")); //the contains method will returns the boolean values & charsequesnce is string
		System.out.println(name22.contains("grow"));// it is case sensitive
		System.out.println(name22.contains("wtechm"));// char sequesnce parameter is string
		System.out.println(name01.contains("vya"));// from global variable am accessing it for contains method
		System.out.println(name01.length());//5
		System.out.println(name01.charAt(2));//v
		System.out.println(name01.indexOf('y'));//3
		System.out.println(name01.toUpperCase());//DIVYA
		System.out.println(name01.toLowerCase());//divya
		System.out.println(name01.concat(" ").concat(First_Name));//Divya Iam Jaswanthi
		System.out.println(name01.contains("dvy"));// false
		//Trim function
		String a1="      Jaswanthi you will get        very very good package in your   next offer     for sure    ";
		System.out.println(a1);// you can see the curser position
		System.out.println(a1.trim());// front and back spaces are trimed by trim function
		// difference between println and print with Sysout statement
		System.out.println("one");//curser position will go to next line here
		System.out.print("two");// curser position will stay on same line
		System.out.println(3);// it gives the output and curser will go to next line
		System.out.print(4);
	}

}
