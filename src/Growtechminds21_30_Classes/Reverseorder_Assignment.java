package Growtechminds21_30_Classes;

import java.util.Arrays;
import java.util.Scanner;

public class Reverseorder_Assignment {

	public static void main(String[] args) {
		String[] name=new String[4];//1st string
		name[0]="usha";
		name[1]="sandhya";
		name[2]="asritha";
		name[3]="utkarsha";
		//Scanner s1=new Scanner(System.in);
		
		//String[] namecopy= new String[s1.nextInt()];//using scanner class
		
		String[] namecopy=new String[name.length];// 2nd string
		String reverse="";
		for(int i=0;i<4;i++)
		{
			//reverse=reverse+name;
			namecopy[i]=name[i]; //right to left 
			//System.out.println(Arrays.toString(name));
	for(int j=3;j>=0;j--)
	{
		namecopy[j]=name[j];
	}
		}
		
		//String c1=reverse.toString();
		//System.out.println((c1));
System.out.println(Arrays.toString(name));
System.out.println(Arrays.toString(namecopy));

	}

}
