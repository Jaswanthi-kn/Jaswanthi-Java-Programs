package GrowTechMinds_31_40_Classes;
class ParentClass  //parent class
{
	static void add()
	{
		System.out.println("1");
	}
	 void add1()
	{
		System.out.println("2");
	}
}
public class Upcasting1 extends ParentClass//child class
{
	static void add2()
	{
		System.out.println("3");
	}
	 void add3()
	{
		System.out.println("4");
	}
public static void main(String[] args) {
		
	ParentClass p1 =new Upcasting1();//implicitly
	p1.add1();
	add();
	add2();
	((Upcasting1) p1).add3();// it is not invocking from child class met
	System.out.println("p1 is upcasting");
	}

}
