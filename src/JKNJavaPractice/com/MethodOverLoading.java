package JKNJavaPractice.com;

public class MethodOverLoading {
void add()
{
	System.out.println("it sis a Non static method-1");
}
void add(int a)
{
	System.out.println("it is non static parameterised-2");
}
static void add(int a,int b,double c)
{
	System.out.println("it is static parameterised-3");
}
void add(double a)
{/*a=0.12;
b=10;
	c=123;
d=123456;*/
	System.out.println("it is non static parameterised-4");
}
	public static void main(String[] args) {
		add(112,124,0.321);
		MethodOverLoading m1=new MethodOverLoading();
		m1.add();
		m1.add(10);
		m1.add(0.12);

	}

}
