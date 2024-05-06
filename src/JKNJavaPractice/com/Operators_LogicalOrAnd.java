package JKNJavaPractice.com;

public class Operators_LogicalOrAnd {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a>b || b==a)
		{
			System.out.println("it is OR operator 1");
		}
		if(a>b && b==a)
		{
			System.out.println("it is AND operator 1");
		}
		if(a<b || b==a)
		{
			System.out.println("it is OR operator 2");
		}
		if(!(a>b && b==a))
		{
			System.out.println("it is AND operator 2");
		}
		if(a<b && !(b==a))
		{
			System.out.println("it is AND operator 3");
		}
		if(!(a<b && !(b==a)))
		{
			System.out.println("it is AND operator 4");
		}
	}

}
