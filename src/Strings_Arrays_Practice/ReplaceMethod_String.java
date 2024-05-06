package Strings_Arrays_Practice;

public class ReplaceMethod_String {

	public static void main(String[] args) {
		String input="school12345";
		System.out.println(input.replace('o', ' '));
		System.out.println(input.replaceAll("[a-z]", " "));
		System.out.println(input.replace('o','m' ));
		System.out.println(input.replaceAll("[A-Z]", "&&&"));
		System.out.println(input.replaceAll("[0-9]", "AMMA"));
		System.out.println(input.replaceAll("[0-9]", ""));
		System.out.println(input.replaceAll("[a-z]", ""));

	}

}
