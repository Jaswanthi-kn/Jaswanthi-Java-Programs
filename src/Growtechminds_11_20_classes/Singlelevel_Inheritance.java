package Growtechminds_11_20_classes;
class One
{
One() extends One
{
	System.out.println("it is constructor:");
}
static void add()
{
	System.out.println("it is add method:");
}
static void sub()
{
	System.out.println("it is sub method:");
}
void div()
{
	System.out.println("it is div method:");
}
}
public class Singlelevel_Inheritance extends One
{
	static void mul()
	{
		System.out.println("it is mul methos:");
	}

	public static void main(String[] args) {
		//One s=new One();
		//s.div();
		Singlelevel_Inheritance s1=new Singlelevel_Inheritance();
		s1.div();
		mul();
		add();
		sub();
		//one(); constructors can not be inherited
		System.out.println("it is a main method: ");

	}

}
