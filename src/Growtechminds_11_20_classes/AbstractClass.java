package Growtechminds_11_20_classes;

// this is not correct yet to correct it 
abstract class One1
{
	abstract void add();
}
public class AbstractClass extends One1 {

	public static void main(String[] args) {
		
		AbstractClass a1= new AbstractClass();
		a1.add();
	}

	@Override
	 void add() {
		//super.add();
		System.out.println("this is child doing overriding");
	}

}
