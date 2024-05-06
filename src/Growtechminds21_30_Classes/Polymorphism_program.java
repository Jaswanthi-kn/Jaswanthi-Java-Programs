package Growtechminds21_30_Classes;

public class Polymorphism_program {

	static void log_in()
	{
		System.out.println("login with mobile number");
	}
	static void log_in(int a)
	{
		System.out.println("login with mobile number with country code");
	}
	static void log_in(int a, int b)
	{
		System.out.println("login with email number");
}
	
	public static void main(String[] args) {
		log_in();
		log_in(10);
		log_in(20, 45);

	}

}
