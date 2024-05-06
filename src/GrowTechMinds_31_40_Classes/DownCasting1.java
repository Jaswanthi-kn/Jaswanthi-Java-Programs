package GrowTechMinds_31_40_Classes;

class ParentClass1  //parent class
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
public class DownCasting1 extends ParentClass1   //child class
{
		static void add()
		{
			System.out.println("3");
		}
		 void add3()
		{
			System.out.println("4");
		}
		 public static void main(String[] args) 
		 {
			
		ParentClass1 p1 =new DownCasting1();//implicitly //upcasting
		DownCasting1 p2=(DownCasting1) p1; //downcasting //DownCasting1 p2=new p1;
		p2.add3();
		p2.add1();
		add();
		add();
		p1.add1();
		p1.add();
		System.out.println("this is Downcasting");
		
		 }
}

