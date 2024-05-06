package Assignmentsby_SDETprograms;

import java.util.Arrays;
//in a string find out the number of alphabets involved
public class Alphabet_Findout {
static int countoofalpha=0;
	public static void main(String[] args) {
		/*String name="manish12345";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		//boolean answer=Character.isAlphabetic(c1[0]);
		//System.out.println(answer);
		for(int i=0;i<=c1.length;i++)
		{
			boolean answer = Character.isAlphabetic(c1[i]);
			countoofalpha++;
		if(answer==true)
		{
			System.out.println("yes it is alpha");
		}
		else
		{
			System.out.println("no it is not alpha");
		}*/
		String name="jaswanthi123";
		char[] N1=name.toCharArray();
		System.out.println(Arrays.toString(N1));
		for(int i=0;i<=N1.length;i++)
		{
			boolean alpha=Character.isAlphabetic(N1[i]);
			countoofalpha++;
		if(alpha==true)
		{
			System.out.println("TRUE - print alpha");
		}
		else
		{
			System.out.println("FALSE - do not print alpha");
		}
		}
		
		
		}
	}
	


