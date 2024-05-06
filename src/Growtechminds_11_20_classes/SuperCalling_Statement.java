package Growtechminds_11_20_classes;

class College //gp
{
int a=30;
int b=10;
int sum=a+b;

	 College(int a, int b, String s)
	{ 
		//College a1=new College(10,20,"Sandhya");
		
		System.out.println(a1.a+a1.b);
	}
}
class School extends College //p
{
	School()
	{
		super(10,20,"apple");
		System.out.println("this is school" );
		
	}
}
public class SuperCalling_Statement  //child
{
	SuperCalling_Statement()
	{

		System.out.println("this is child class");
	}
	public static void main(String[] args) {
		School s1=new School();
		SuperCalling_Statement a1=new SuperCalling_Statement();
		
		
		

	}

}
