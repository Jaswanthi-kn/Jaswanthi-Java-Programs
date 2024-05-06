package Growtechminds21_30_Classes;

public class OverLoading_MainMethod {
// we can overload the main method 
	//we can not over ride the main method -----main metrhod is static only non static we can overload
	/// also we can not over load the constructors - we cant inherit the constructors ....no relation like extends
	public static void main(String[] args) 
	{
		main2(10);
		main1(34);
		main();
		System.out.println(1);
	}
	public static void main()
	{
		System.out.println(2);
	}
public static void main1(int a)
	{
	System.out.println(3);
	}
public static void main2(int a )
{
	System.out.println(10);
}
}


