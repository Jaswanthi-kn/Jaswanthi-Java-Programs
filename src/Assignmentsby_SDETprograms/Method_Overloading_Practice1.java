package Assignmentsby_SDETprograms;

public class Method_Overloading_Practice1 {
	 static {
		int c=20;
		int d=10;
		int sum=c+d;
		System.out.println("This is static initialization block +" + sum);
	}

	{
	int c=20;
	int d=10;
	int sub=c-d;
	System.out.println("This is instance initialization block +" + sub);
}
	//abstract Method_Overloading_Practice1() - getting compile time error as illegal modifier for the constructor type
	//final Method_Overloading_Practice1() - getting compile time error as illegal modifier for the constructor type
	 Method_Overloading_Practice1()
	{
		System.out.println("This is a constructor");
	}

	public static void main(String[] args) {
		System.out.println("this is a main method");
		Method_Overloading_Practice1 m1=new Method_Overloading_Practice1();
		m1.collage(10);
		m1.collage(123, 1.25);
		m1.collage("Jaswanthi", true, 63);
		m1.collage('q', 12, 1.23, 45, 962094105);
		student(13);
		student(19,5.36);
		student("Jassy", false, 56);
		student('s',46,9.32,23,45612);

	}
static void student(int a)
{
	System.out.println("1_argument");
}
static void student(int a, double d)
{
	System.out.println("2_argument");
}
static void student(String a,boolean d,long i)
{
	System.out.println("3_argument");
}
static void student(char e,int a,double d,int i,long w)
{
	System.out.println("5_argument");
}
void collage(int a)

	{
		System.out.println("1_argument Non static");
	}
void collage(int a, double d)
	{
		System.out.println("2_argument Non static");
	}
 void collage(String a,boolean d,int i)
	{
		System.out.println("3_argument Non static");
	}
 void collage(char e,int a,double d,int i,long w)
	{
		System.out.println("5_argument Non static");
	}

}


