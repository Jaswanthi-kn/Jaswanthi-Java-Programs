package Growtechminds_11_20_classes;

public class Final_Variable {
	final static double pi=3.14;//Global static (if non static global means we need to object)
	 static void add()
	{
		final int a=12;
		
		// a=13;
		System.out.println(a);
	}
	public static void main(String[] args) {
		//pi = 3.14;
		add();
		System.out.println(pi);

	}

}
