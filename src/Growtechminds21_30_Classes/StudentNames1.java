package Growtechminds21_30_Classes;

public class StudentNames1 {

	public static void main(String[] args) {
		String name[]=new String[3];
		name[0]="Sreedevi";
		name[1]="usha";
		name[2]="Sandhya";
int rollno[]=new int[3];
rollno[0]=10;
rollno[1]=20;
rollno[2]=30;
char gender[]=new char[3];
gender[0]='F';
gender[1]='M';
gender[2]='M';
System.out.println("names"+"         "+"rollno"+"        "+"gender");
for(int i=0;i<3;i++)
{
	
	System.out.println(name[i]+"           "+rollno[i]+"            " + gender[i]);
}
	}
	

}
