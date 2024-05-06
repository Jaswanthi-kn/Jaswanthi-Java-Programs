package Strings_Arrays_Practice;

import java.util.Arrays;

public class Specific_number_PresentORnot {
// check the output some issue
	public static void main(String[] args) {
		int[] name=new int[3];
		name[0]=10;
		name[1]=20;
		name[2]=30;
		//name[3]=10;
		int exiatingno=10;
		System.out.println(Arrays.toString(name));
		for(int i=0;i<=name.length;i++)
		{
			if(exiatingno==name[i])
			{
				System.out.println("the given no is present");
			}
			
		
		}
		
		
	}

}
