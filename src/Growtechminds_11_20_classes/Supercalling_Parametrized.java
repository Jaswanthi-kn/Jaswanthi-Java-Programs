package Growtechminds_11_20_classes;

class Dechan
{
	Dechan(int a)
	{
		System.out.println("it is a Dechan constructor - 1");
	}
	
}
class Sandhya extends Dechan
{
	Sandhya(int i,int d)
	{
		super(45);
		System.out.println("it is a Sandhya constructor - 2");
	}
	
}
class Usha extends Sandhya
{
	Usha(int a, double b,String g)
	{
		super(0, 45);
		System.out.println("it is a Usha constructor - 3");// yet to print 
	}
}
public class Supercalling_Parametrized extends Usha
{
	Supercalling_Parametrized()
	{
		super(10,1.23,"Jaswanthi");
		System.out.println("it is a child class constructor - 4");//yet to print
		
	}

	public static void main(String[] args) 
	{
		Supercalling_Parametrized c1= new Supercalling_Parametrized();
		System.out.println("It is a main method");
	}

}
