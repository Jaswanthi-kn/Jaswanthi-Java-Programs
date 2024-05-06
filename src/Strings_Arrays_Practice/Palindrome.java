package Strings_Arrays_Practice;

public class Palindrome {
//check the output have issue
	public static void main(String[] args) {
		String name="radar";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char answer= name.charAt(i);
			reverse=reverse+answer;
			}
System.out.println(reverse);
	
if(name.equals(reverse))
{
	System.out.println("it is a palindrome");
}
{
	System.out.println("it is not a palindrome");
	
}
}
}