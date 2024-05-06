package Growtechminds_11_20_classes;

 class One11//final classes can not be inherited  
{
	static void mul()
	{
		System.out.println("it is mul statement");
	}
}

public class Finalclass_Inheritance extends One11 {

	void add()
	{
		System.out.println("it is add method");
	}
	public static void main(String[] args) {
		System.out.println("it is main method");
		Finalclass_Inheritance f1= new Finalclass_Inheritance();
		f1.add();
		mul();

	}

class One1
{
	static void add()
	{
		System.out.println("add");
	}
}
class Two2 extends One1
{
	static void add()
	{
		System.out.println("sub");
	}
}
class Three3 extends Two2
{
	static void add()
	{
		System.out.println("mul");
	}
	public static void main(String[] args) {
		System.out.println("It is a main method");
		add();
	}
}
}
		
	
	














