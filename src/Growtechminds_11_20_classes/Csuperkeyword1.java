package Growtechminds_11_20_classes;

class one
{
	void Login1()
	{
		System.out.println("it is a grand parent class Non static method");
	}
}
class Two extends one
{
	void logout1()
	{
		System.out.println("it is a parent class non static method");
	}
	
}

public class Csuperkeyword1 extends Two
{
	void workinprogress()
	{
		System.out.println("it is a child class non static method");
	}

	public static void main(String[] args) {
		Csuperkeyword1 s1= new Csuperkeyword1();
		s1.logout1();
		s1.Login1();
		s1.workinprogress();

	}

}




















