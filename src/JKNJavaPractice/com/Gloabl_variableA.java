package JKNJavaPractice.com;

public class Gloabl_variableA {
	static int a=10;
	static int b=20;
String name ="pastha";
int d= 25;
int c=25;
double h=1.65;
double g=1.23;

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		a=12;b=32;
		System.out.println(a);
		System.out.println(b-a);
		System.out.println(b);
		System.out.println(a+b);
		Gloabl_variableA GVA =new Gloabl_variableA();
		System.out.println(GVA.d*GVA.c);
		System.out.println(GVA.h*GVA.g);
		System.out.println(GVA.d/GVA.c);
		System.out.println(GVA.h/GVA.g);
		System.out.println(GVA.d%GVA.c);
		System.out.println(GVA.h%GVA.g);
	}

static void add()
{
int a=10;
int b=20;
System.out.println(a+b);
}
static void sub()
{
	int a=10;
	int b=20;
	System.out.println(a-b);
}
static void mul()
{
	int a=10;
	int b=20;
	System.out.println(a*b);
}
static void div()
{
	int a=10;
	int b=20;
	System.out.println(a/b);	
}
}
/*public class one
 * String name="sita";
 * int age ="19";
 * double weight ="68.05;
 * void add(int age, String name, double weight);
 * {
 * System.out.println("my data is " +age , +weight, +name);
 * }
 * public static void main(String args[])
 * {
 * one a= new one();
 * a.add(16,"Ramu",60);
 * System.out.println(a.age);
 * System.out.println(a.name)
 * System.out.println(a.weight);
 */
