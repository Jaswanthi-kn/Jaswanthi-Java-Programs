package Growtechminds_11_20_classes;
abstract class Abc
{
	abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();

}
public class Abstract_Ex1 extends Abc{
static void mod()
{
	System.out.println("it is a mod method");
}
	public static void main(String[] args) {
		mod();
		Abstract_Ex1 w1= new Abstract_Ex1();
w1.add();
	}

	@Override
	 void add() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void div() {
		// TODO Auto-generated method stub
		
	}

}
