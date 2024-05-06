package Growtechminds21_30_Classes;

import java.util.Date;

public class ToGetFuturetime {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());//epoch time
		Date d2=new Date(d1.getTime()+(60*60*1000*24*1));//past date and future dates
				System.out.println(d2);
				Date d3=new Date(d2.getTime()-(60*60*1000*24*1));
				System.out.println(d3);

	}

}
