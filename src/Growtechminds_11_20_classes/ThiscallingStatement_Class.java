package Growtechminds_11_20_classes;

public class ThiscallingStatement_Class 
{ 
	ThiscallingStatement_Class()
	{
		this(10,"Jassy");
		System.out.println(1);
	}
	ThiscallingStatement_Class(int a, String b)
	{
		this(45,1.23f,15);
		System.out.println(3);
	}
	ThiscallingStatement_Class(int a, float f,int i)
	{
		System.out.println(4);
	}

	public static void main(String[] args) {
		System.out.println("it is a main method");
		ThiscallingStatement_Class c2= new ThiscallingStatement_Class();

	}

}
