package Growtechminds_11_20_classes;

public class TwoClass extends OneClass
{
static void sub1()
{
	System.out.println("it is sub1 method");
}
static void sub2()
{
	System.out.println("it is sub2 method");
}

public static void main(String args[])
{
	System.out.println("it is 2class mainmethod");
	TwoClass c2= new TwoClass();
	c2.add3();
	add2();
	add1();

}
}