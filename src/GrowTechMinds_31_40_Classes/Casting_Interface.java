package GrowTechMinds_31_40_Classes;
interface Upcasting  // parent interface
{
	void add();
}

public class Casting_Interface implements Upcasting // this is child class
{
	void add1()
	{
		System.out.println("this is child class");
	}
	public static void main(String[] args) {
		Upcasting U1	= new Casting_Interface(); //implicitly
		//Upcasting U2 = Casting_Interface // how to do explicitly upcasting
		Casting_Interface U2 =(Casting_Interface)U1;
	U2.add();
	U2.add1();
	U1.add();
	}
	

	@Override
	public void add() {
		System.out.println("this is overriden abstract method");
	
	}

}
