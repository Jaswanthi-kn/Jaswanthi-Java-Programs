package Growtechminds21_30_Classes;

import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {
		
		Date d1=new Date(); //present date
		System.out.println(d1);
		//System.out.println(d1.getTime());//epoch 
	String input=d1.toString();//to manipulate string functions we r converting
	System.out.println(input);
	String month=input.substring(4, 7);
	System.out.println(month);
	String date=input.substring(8, 10);
	System.out.println(date);
	System.out.println(input.length());
	String year=input.substring(24);
	System.out.println(year);
	System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
	System.out.println(date+ " " + month+" " + year);
	//System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
	System.out.println(date+ "-" + month+"-" + year);
	System.out.println(date+ "/" + month+"/" + year);
	
	}

}
