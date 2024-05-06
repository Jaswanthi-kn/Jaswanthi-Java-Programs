package Growtechminds21_30_Classes;

public class ReverseString_VerticalOutput {

	public static void main(String[] args) {
		//String name ="sandhay";
		String country ="India";
		for(int i=0;i<country.length();i++)
		{
			System.out.println(country.charAt(i));
			}
			for(int i=country.length()-1;i>=0;i--)
			{
				System.out.print(country.charAt(i));
				//System.out.println(country.charAt(i));
				
			}

	}

}
