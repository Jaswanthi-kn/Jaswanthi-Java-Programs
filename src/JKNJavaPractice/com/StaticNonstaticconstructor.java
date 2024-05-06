package JKNJavaPractice.com;

public class StaticNonstaticconstructor {
	StaticNonstaticconstructor()//non parameterized constructor
	{
		System.out.println(1);
	}
	StaticNonstaticconstructor(int a,String d)//Parameterized constructor
	{
		System.out.println(2);
	}
	StaticNonstaticconstructor(String d,char j)//Parameterized constructor
	{
		System.out.println(3);
	}
	public static void add()
	{
		System.out.println(4);
	}
	static void sub()
	{
		System.out.println(5);
	}
	static void mul()
	{
		System.out.println(6);
	}
	static void div()
	{
		System.out.println(7);
	}
	public void add1()
	{
		System.out.println(8);
	}
	public void add2()
	{
		System.out.println(9);
	}
	 void add3()
	{
		System.out.println(10);
	}
	public static void main(String[] args) {
		StaticNonstaticconstructor s3=new StaticNonstaticconstructor();
		StaticNonstaticconstructor s4=new StaticNonstaticconstructor(1,"k");
		StaticNonstaticconstructor s5=new StaticNonstaticconstructor("P",'h');
		s3.add1();
		s3.add2();
		s3.add3();
		add();
		sub();
		mul();
		div();
		

	}

}
