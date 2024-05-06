package JKNJavaPractice.com;

public class StaticMethod {
	//static method calling in main method practice with multiple methods 
public static void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
public static void sub() {
	int a=10;
	int b=20;
	int c=a-b;
	System.out.println(c);
}
	public static void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	public static void div() {
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
	public static void Modulus() {
		int a=10;
		int b=20;
		int c=a%b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		Modulus();
		add();
		
		

	}

}
