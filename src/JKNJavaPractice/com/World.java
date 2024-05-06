package JKNJavaPractice.com;

public class World {
	World()//non parametrized constructor
	{
	System.out.println("1");
	}
	World(double a)//parametrized constrctor
	{
	System.out.println("2");
	}
	World(int a)//parametrized constrctor
	{
	System.out.println("3");
	}
	World(String a)//parametrized constrctor
	{
	System.out.println("4");
	}
	World(int a,double b)//parametrized constrctor
	{
	System.out.println("5");
	}
	public static void main(String[] args) {
		World w1=		new World();//non parametrized object creation
		World w2=	new World(3.14);// parametrized object creation
		World w3=new World(100,90.76);
		World w4=new World("1");
	}

}
