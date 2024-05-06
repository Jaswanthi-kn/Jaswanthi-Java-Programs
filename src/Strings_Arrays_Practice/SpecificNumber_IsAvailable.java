package Strings_Arrays_Practice;

import java.util.Arrays;

public class SpecificNumber_IsAvailable {

	public static void main(String[] args) {
		int[] name=new int[2];
		name[0]=20;
		name[1]=21;
		name[2]=22;
		int givenno=20;
		System.out.println(Arrays.toString(name));
		
		for(int i=0;i<name.length;i++)
		{
			if(givenno==name[i])
			{
				System.out.println("yes available");
			}
			
		}
				
		

	}

}
