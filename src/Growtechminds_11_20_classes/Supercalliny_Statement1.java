package Growtechminds_11_20_classes;

class Parent_class1
{
	Parent_class1()
	{
		System.out.println("it is a Parent_class1 - constructor1");
	}
}
class Parent_class2 extends Parent_class1
{
	Parent_class2()
	{
		super();
		
		System.out.println("it is a Parent_class2 - constructor2");
		//super();
	}
 
}
public class Supercalliny_Statement1 extends Parent_class2
{
	Supercalliny_Statement1()
	{
		super();
		System.out.println("it is a Supercalliny_Statement1 - child class constructor 3");
	}

	public static void main(String[] args) 
	{
		System.out.println("its is a main method");
		Supercalliny_Statement1 t1= new Supercalliny_Statement1();
		

	}

}
