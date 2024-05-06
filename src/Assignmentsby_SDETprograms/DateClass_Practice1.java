package Assignmentsby_SDETprograms;

import java.util.Date;

public class DateClass_Practice1 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		String name=d1.toString();
		System.out.println(name);
		String month=name.substring(4,7);
		System.out.println(month);
		String date=name.substring(8, 10);
		System.out.println(date);
		String year=name.substring(24);
		//String year1=name.substring(24,29); // not comg output
		System.out.println(year);
        System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
        System.out.println(date.concat("-").concat(month).concat("-").concat(year));
        System.out.println(date.concat("/").concat(month).concat("/").concat(year));
        Date d2= new Date(d1.getTime()+(60*60*1000*24*1));
        //System.out.println(d1.getTime());// epoch time and date
       // System.out.println(d1.getTime()+(60*60*1000*24*1));
        System.out.println(d2);
        Date d3=new Date(d2.getTime()-(60*60*1000*24*2));
        System.out.println(d3);

	}

}
