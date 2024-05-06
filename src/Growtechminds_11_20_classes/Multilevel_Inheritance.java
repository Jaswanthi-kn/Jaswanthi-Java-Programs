package Growtechminds_11_20_classes;

class Grand_Parent
{
	static void add()
	{
		System.out.println("it is Grand_Parent add method");
	}
}
class Parent  extends Grand_Parent
{
	void sub()
	{
		System.out.println("it is Parent sub method");
	}
}
public class Multilevel_Inheritance extends Parent {

	public static void main(String[] args) {
		System.out.println("it is childclass - Multilevel_Inheritance");
		Multilevel_Inheritance m1= new Multilevel_Inheritance();
		m1.sub();
		add();
	}

}

