package Growtechminds_11_20_classes;
interface Keyword // interface 
{
	void login();
	void gmail();// abstract method
}

public class Interface_1 implements Keyword
{
static void add()
{
	System.out.println("it is a concrete method 1");
}
void sub()
{
	System.out.println("it is a non static concrete method");
}
public static void main(String[] args) 
{
	System.out.println("it is a main method");
	Interface_1 i1= new Interface_1();
	i1.login();
	i1.gmail();
	add();
	i1.sub();
}
	@Override
	public void login() {
		System.out.println("it is a overridden method from parent abstract class 1");
		
	}
	@Override
	public void gmail() {
		System.out.println("it is a overridden method 2 from parent abstract class 2");
		
	}

}
