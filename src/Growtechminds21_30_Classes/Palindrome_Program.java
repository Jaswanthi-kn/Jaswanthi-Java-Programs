package Growtechminds21_30_Classes;

public class Palindrome_Program {

	public static void main(String[] args) {
		String name="radarda";//6 - i=6 a=a;r=0+a ;r=a // i=5 r=a+d ;
		String reverse="";
	
		for(int i=name.length()-1;i>=0;i--)
		{
			char a=name.charAt(i);
			reverse=reverse+a;
			System.out.println(a);
			}
	
		System.out.println(reverse);
		if(name.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	
	
}
