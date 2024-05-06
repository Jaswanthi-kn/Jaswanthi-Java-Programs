package Assignmentsby_SDETprograms;

public class Palindrom_Ex1 {

	public static void main(String[] args) {
/*String name="MOMM"; //MOM
String reverse="";
for(int i=name.length()-1;i>=0;i--)
{
	char a=name.charAt(i);
	reverse= reverse+a;
	System.out.println(a);
}
System.out.println(reverse);
if(name.equals(reverse))
{
	System.out.println("it is a palindrome");
}
else
{
	System.out.println("it is not a palindrome");
} */
		String number="123219";
		String reverse="";
		for(int i=number.length()-1;i>=0;i--)
		{
			char a=number.charAt(i);
			reverse=reverse+a;
			System.out.println(a);
		}
		System.out.println(reverse);
		if(number.equals(reverse))
		{
			System.out.println("it is a pali");
		}
		else
		{
			System.out.println("it is not a pali");
		}
			
		
	}

}
