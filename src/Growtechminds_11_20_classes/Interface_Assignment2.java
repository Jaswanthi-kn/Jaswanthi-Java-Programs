package Growtechminds_11_20_classes;
interface Interface1 //grand parent 
{
	void login(); // abstract method 1
	void logout(); // abstract method 2
}
interface Interface2 extends Interface1 //parent
{
	void search(); // abstract method 1
	void payment(); // abstract method 2
}
public class Interface_Assignment2 implements Interface2
{
	void order_page()
	{
		System.out.println("this is concrete methos - static");
	}
	static void address_page()
	{
		System.out.println("this is concrete methos - Non_static");
	}
	public static void main(String[] args) {
		System.out.println("this is main methos");
		Interface_Assignment2 i2= new Interface_Assignment2();
		i2.login();
		i2.logout();
		i2.search();
		i2.payment();
		i2.order_page();
		address_page();
	}
	@Override
	public void search() {
		System.out.println("it is a overridden search abstract method");

	}

	@Override
	public void payment() {
		System.out.println("it is a overridden payment abstract method");

	}
	@Override
	public void login() {
		System.out.println("it is a overridden login abstract method");

	}
	@Override
	public void logout() {
		System.out.println("it is a overridden logout abstract method");

	}


}
