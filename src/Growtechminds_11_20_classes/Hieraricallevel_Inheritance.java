package Growtechminds_11_20_classes;

class Parent1
{
	 void add()
	{
		System.out.println("it is parent1 class");
	}
	
}

class Child1 extends Parent1
{
	static void add1()
	{
		System.out.println("it is child1 class");
	}
}

class Child2 extends Child1
{
	static void add3()
	{
		System.out.println("it is child2 class");
	}
	
}
class Child3 extends Child2
{
	 void add4()
	{
		System.out.println("it is child3 class");
	}
}
public class Hieraricallevel_Inheritance extends Child3
{
	static void add5()
	{
		System.out.println("it is child4/Hieraricallevel_Inheritance class");
	}
	public static void main(String[] args) {
		System.out.println("it is main method message");
		Hieraricallevel_Inheritance h1=new Hieraricallevel_Inheritance();
		//scanner s1=new scanner();
		h1.add();
		h1.add4();
		add1();
		add3();
		add5();
		
		

	}

}
