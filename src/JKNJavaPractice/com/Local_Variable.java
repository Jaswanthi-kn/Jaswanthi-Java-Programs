package JKNJavaPractice.com;

public class Local_Variable 
{/*Local variable is declare and initialize inside the method 
	the scope of local variable is with in the method
	there is no default values for local variables 
	local variables can not be distinguish between static and non static
	it can be declared and initialized in 2 line but with in the method only also we can update the value with in the method */
static void add() {
	int a=10; // Local variable
	int b;
	b=20;//Local variable
	System.out.println(a+b);
}
private String age;
private String name;
private String weight;
void mul()
{
	int a=100;
	int b;
	b=200;
	a=40;
	System.out.println(a*b);
}
void div(int age, String name, double weight)
{
	System.out.println("non satic values with p " +age  +name +weight);
}


	public static void main(String[] args) {
		add();
		sub();
		Local_Variable LV= new Local_Variable();
		LV.mul();
		LV.div(15, "Manish", 0.23f);
		
	}
	static void sub() {
		int a;
		a=10;// Local variable
		int b=20;//Local variable
		System.out.println(a-b);
	}
	
}
