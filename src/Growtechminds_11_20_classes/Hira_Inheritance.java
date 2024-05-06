package Growtechminds_11_20_classes;

class Parent11
{
void add()
{
	System.out.println("add method");
}
}
class chilli1 extends Parent11
{
	 void sub()
	{
		System.out.println("sub method");
	}
}

public class Hira_Inheritance  
{

	public static void main(String[] args) {
		System.out.println("it is main method");
		//Hira_Inheritance h1= new Hira_Inheritance();
		chilli1 c1= new chilli1();
		Parent11 p1= new Parent11();
	p1.add();
		//h1.add();
		c1.sub();
	}

}
