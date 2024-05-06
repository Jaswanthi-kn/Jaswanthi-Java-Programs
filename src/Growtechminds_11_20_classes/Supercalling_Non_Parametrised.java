package Growtechminds_11_20_classes;

class First_Gift
{
	First_Gift()
	{
		System.out.println("constructor -- 1");
	}
}
class Second_Gift extends First_Gift
{
	Second_Gift()
	{ 
		super();
		System.out.println("constructor -- 2");
	}
}
class Third_Gift extends Second_Gift
{
	Third_Gift()
	{
		super();
		System.out.println("constructor -- 3");
	}
}
class Fourth_Gift extends Third_Gift
{
	Fourth_Gift()
	{
		super();
		System.out.println("constructor -- 4");
		//super(); // super calling statement we should use first line of the method 
	}
}
public class Supercalling_Non_Parametrised extends Fourth_Gift {
	Supercalling_Non_Parametrised()
	{
		super();
		System.out.println("constructor --5");
	}

	public static void main(String[] args) {
		//super(); // we cant call in main method 
		Supercalling_Non_Parametrised p1= new Supercalling_Non_Parametrised();
		System.out.println("this is a main method");
 		
 		

	}

}
