package Assignmentsby_SDETprograms;

public class ReverseString_Vertical1 {

	public static void main(String[] args) {
		String name="jaswanthi";
		System.out.println(name.length());// to get the length of the string
		for(int i=0;i<9;i++) // to get the vertical order output
		{
		System.out.println(name.charAt(i));
		}
		String name1="AarnavGirish";
for(int i=name1.length()-1;i>=0;i--)// to get the reverse order output
{
	System.out.print(name1.charAt(i));
}
}
}	


