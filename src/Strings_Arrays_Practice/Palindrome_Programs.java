package Strings_Arrays_Practice;

public class Palindrome_Programs {

	public static void main(String[] args) {
		/*String input="mom";
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char output=input.charAt(i);
			reverse=reverse+output;
		}
System.out.println(reverse);
if(input.equals(reverse))
{
	System.out.println("it is a palindrome");
}
else
	System.out.println("it is not a palindrome");
	}
String name="radar";
String reverse="";
for(int i=name.length()-1;i>=0;i--)
{
	char c1=name.charAt(i);
reverse =reverse+c1;
}
System.out.println(reverse);
if(name.equals(reverse))
{
	System.out.println("it is a palindrome");
	
	}
else
	System.out.println("it is not a palindrome");
*/
		
	/*	String A1="malylam";
		String A2="";
		for(int i=A1.length()-1;i>=0;i--)
		{
			char output= A1.charAt(i);
			A2=A2+output;
		}
		System.out.println(A2);
		if(A1.equals(A2))
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		} */
		String name1="ABABA";
		String reverse="";
		for(int i=name1.length()-1;i>=0;i--)
		{
			char a2=name1.charAt(i);
			System.out.println(a2);
			reverse=reverse+a2;
		} 
		System.out.println(reverse);
		if(name1.equals(reverse))
		{
			System.out.println("it is a palindrome");
		}
		else
			System.out.println("it is not a palindrome");
	}
		
}

