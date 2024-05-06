package Strings_Arrays_Practice;

import java.util.Arrays;

public class Fourthclass_Programs {
static int countofalpha=0;
static int countofnumeric=0;
static int countofspaces=0;
private static boolean answer13;
	public static void main(String[] args) {
		/* // find out the number of alphabets involved in the given string
	String name="Dhanalakshmi143";
		char[] c1=name.toCharArray(); // converted string to char[]
		System.out.println(Arrays.toString(c1));// import arrays java utill pack
/*boolean answer= Character.isAlphabetic(c1[0]);
System.out.println(answer);
boolean answerr= Character.isAlphabetic(c1[1]);
System.out.println(answerr);
		for(int i=0;i<=c1.length;i++)
		{
			boolean answer_1=Character.isAlphabetic(c1[i]);
			//System.out.println(answer_1);
		}
 if(answer_1==true)
{
	countofalpha++;
}
System.out.println(countofalpha);  


++++++++++++++++++++++++++++++++++++++++++++++++++++++++  

String name="Dhanalakshmi143";
char[] c1=name.toCharArray(); // converted string to char[]
System.out.println(Arrays.toString(c1));
for(int i=0;i<=c1.length;i++)
{
	boolean answer_1=Character.isAlphabetic(c1[i]);
	//System.out.println(answer_1);
}
if(answer_1==true)
{
countofalpha++;
}
System.out.println(countofalpha);*/

		String name="Dhanalakshmi143";
		char[] c1=name.toCharArray(); // converted string to char[]
		System.out.println(Arrays.toString(c1));// import arrays java utill pack
		for(int i=0;i<=c1.length;i++)
		{
			boolean answer13=Character.isAlphabetic(c1[i]);
			System.out.println(answer13);
		}
 if(answer13==true)
{
	countofalpha++;
	countofnumeric++;
	countofspaces++;
	int sum=countofalpha +countofnumeric +countofspaces;
	//System.out.println(sum);
}


		}
}
	
	


