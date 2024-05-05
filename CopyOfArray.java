package Growtechminds21_30_Classes;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfArray {

	public static void main(String[] args) {
		String[] name=new String[4];//1st string
		name[0]="usha";
		name[1]="sandhya";
		name[2]="asritha";
		name[3]="utkarsha";
		Scanner s1=new Scanner(System.in);
		
		//String[] namecopy= new String[s1.nextInt()];//using scanner class
		
		String[] namecopy=new String[name.length];// 2nd string
		for(int i=0;i<name.length;i++)
		{
			namecopy[i]=name[i]; //right to left 
		}
System.out.println(Arrays.toString(name));
System.out.println(Arrays.toString(namecopy));	

}

}
