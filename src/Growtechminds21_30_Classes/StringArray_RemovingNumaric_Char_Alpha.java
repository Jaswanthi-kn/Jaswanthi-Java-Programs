package Growtechminds21_30_Classes;

public class StringArray_RemovingNumaric_Char_Alpha {

	public static void main(String[] args) {
		String input="school123";
		String input1="UtKarsHa57886ff";
		String output=input.replace('o', ' ');
		System.out.println(output);
		String output1=input.replace('s','$');
		System.out.println(output1);
		
		String output2=input.replaceAll("[a-z]","");
		System.out.println(output2);
		String output3=input.replaceAll("[0-9]", "");
System.out.println(output3);
String output4=input1.replaceAll("[0-9]",output3);
System.out.println(output4);


	}

}
