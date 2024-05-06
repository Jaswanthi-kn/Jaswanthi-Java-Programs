package Growtechminds_11_20_classes;
class Flipkart_1 // this is grand parent 
{
	static void login()//Concrete method 1
	{
		System.out.println("it is login method");
	}
	 void login_email()//Concrete method 2
	{
		 
		System.out.println("it is login_email method");
	}
}
abstract class Amazon_1 extends Flipkart_1
{
	abstract void add();//this is abstract method 1
	abstract void sub();//this is abstract method 2
	static void mul() // this is concrete method 1
	{
		System.out.println("it is mul method 1");
	}
	 void div()// // this is concrete method 2
	{
		System.out.println("it is div method 2");
	}
}

 class Assignment_Abstractclass extends Amazon_1 {

	static void mod()
	{
		System.out.println("it is mod method");// concrete method 1
	}
	 void mod1()
	{
		System.out.println("it is mod1 method");// concrete method 2
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}

}
