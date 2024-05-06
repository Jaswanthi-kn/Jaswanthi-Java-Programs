package Growtechminds_11_20_classes;
// i wrote 2 programs here on super keyword just check below
/*class Overriding_Parent
{
	void ligin()
	{
		System.out.println("it is a ligin method");
	}
}
public class MethodOverriding_Superkeyword extends Overriding_Parent
{
	void logout()
	{
		super.ligin();
		System.out.println("it is MethodOverriding_Superkeyword logout method");
		
	}

	public static void main(String[] args) {
		MethodOverriding_Superkeyword m1= new MethodOverriding_Superkeyword();
		m1.logout();
		

	}

}*/
class Amazon1
{
	void options()
	{
		System.out.println("it is a options method - non static grand parent class");
	}
}
class Myntra extends Amazon1
{
	void search()
	{
		super.options();
		System.out.println("it is a search method - non static parent class");
		super.options();
		super.options();
	}
}
public class MethodOverriding_Superkeyword extends Myntra
{
	void click()
	{
		super.search();
		System.out.println("it is a click method - non static child class");
		super.options();
	}

public static void main(String[] args)
{
	MethodOverriding_Superkeyword a1= new MethodOverriding_Superkeyword();
	a1.click();
	//super.options(); // we cant use super keyword in main method 
}
}

