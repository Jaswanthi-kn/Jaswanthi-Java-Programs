package Strings_Arrays_Practice;

import java.util.Date;

public class SecondClass_Program {

	public static void main(String[] args) {
		//lets print my name in vertical manner
		/*String name="Geetha";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));
		System.out.println(name.charAt(5));
		
		System.out.println("========================");
		
		for(int i=0;i<name.length();i++)
		{
			char a1=name.charAt(i);
			System.out.println(a1);
			
		} */
		//lets print the string in reverse order
		/* String name1="Neelakantan";
		for(int i=name1.length()-1;i>=0;i--)
		{
			char a2=name1.charAt(i);
			System.out.println(a2);
			
		} */
		// lets check if the string is empty or not
		/*String name11="  ";
		System.out.println(name11.isEmpty());// empty method should not have any white space then it will true
		String name12="";
		System.out.println(name12.isBlank());// blank method have any white space or no space also it will true
		
		*/
		//System.out.println("...................................");
		
	//lets deal with sub string , here 2 types 1 substring() and 2nd is subsequence(n, n-1)
		/*String Text="I am staying at near by RR nagar metro station";
		System.out.println(Text.substring(6));//it will print from the given index position to till end of the text
		System.out.println(Text.substring(9, 12));
		*/
		// dealing with DATE Class
		/*Date d1=new Date();// importing date class fron java utill package
		System.out.println(d1);
		String input=d1.toString();//convert date class to string 
		System.out.println(input);
		String month= input.substring(4,7);
		System.out.println(month);
		String date=input.substring(8, 10);
		System.out.println(date);
		String Day=input.substring(0, 3);
		System.out.println(Day);
		String year=input.substring(24);
		System.out.println(year);
		System.out.println(Day.concat(" ").concat(month).concat(" ").concat(date).concat(" ").concat(year));
		System.out.println(Day.concat(" /").concat(month).concat(" /").concat(date).concat(" /").concat(year));
		System.out.println(Day.concat("- ").concat(month).concat("- ").concat(date).concat("- ").concat(year));
		*/
        Date d1=new Date();
        System.out.println(d1.getTime());// got epoch time 
        //Date d2=new Date(d1.getTime());// we are converting epoch time to normal human readable time 
       // System.out.println(d2);
        //Date d3=new Date(d2.getTime());// same thing again but class i created 2 times just tried
       //System.out.println(d3);
        //Date d2=new Date(d1.getTime()+(60*60*1000*24*1));// 1 day future date
      //  System.out.println(d2);
        Date d2=new Date(d1.getTime()-(60*60*1000*24*1));// 1 day past date and we can try with how many days we want
        System.out.println(d2);
        
        String name="Geetha";
        		for(int i=0;i<name.length();i++)
        		{
        			char a1=name.charAt(i);
        			System.out.println(a1);
        			
        		} 
        		String name123="Geetha";
        		for(int i=name.length()-1;i>=0;i--)
        		{
        			char a11=name123.charAt(i);
        			System.out.println(a11);
        			
        		} 
        
	}
	
	

}
