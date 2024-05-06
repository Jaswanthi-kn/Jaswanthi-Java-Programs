package Growtechminds21_30_Classes;

public class Sizeofthe_Array {

	public static void main(String[] args) {
		String name[]=new String[5];//size of the array
		name[0]="Sreedevi";
		name[1]="usha";
		name[2]="Sandhya";
		name[3]="swetha";
		name[4]="divya";
		//System.out.println(name[0]);
		//System.out.println(name[1]);
		//System.out.println(name[2]);
		//System.out.println(name[3]);
		//System.out.println(name[4]);
		//for(int i=0;i<=4;i++)
		//for(int i=0;i<5;i++)
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		

	}

}
