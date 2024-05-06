package Assignmentsby_SDETprograms;

public class ConstructorOverloading {
//int id=12345;
//String name="Jaswanthi";

//final ConstructorOverloading() it is giving compile time error final 
 ConstructorOverloading()
{
	System.out.println("this is the constructor without parameter 1");
}
ConstructorOverloading(int a,String n)
{
	System.out.println("This is the parameterized constructor 1");
}
ConstructorOverloading(int a,double d,char s,boolean e)
{
	System.out.println("This is the parameterized constructor 2");
}
	public static void main(String[] args) 
	{
		//System.out.println("\ndefault constructor values:\n" +0  +"null");
		System.out.println("This is the Main Method");
		//ConstructorOverloading c3= new ConstructorOverloading(); // all non para constructors
		new ConstructorOverloading(); 
		new ConstructorOverloading(1,"jassy");
	//	ConstructorOverloading c2=new ConstructorOverloading();
	new ConstructorOverloading(12345,"Jaswanthi");
new ConstructorOverloading(12,1.23,'D',true);
	

	}

}
