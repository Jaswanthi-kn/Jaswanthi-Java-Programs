package JKNJavaPractice.com;
public class Manish 
{
	Manish()//method 1
	{
		System.out.println("Constructor");
	}
	void add()//method2
	{
		System.out.println("Non Static ");
	}
	static void sub()//method 3
	{
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) //method 4
	{
		Manish m1=new Manish();//syntax 1
		m1.add();
		sub();

	}

}
