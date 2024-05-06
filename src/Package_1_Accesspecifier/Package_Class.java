package Package_1_Accesspecifier;

public class Package_Class 
// all type of access specifiers we can access from package with in the class
{
public void Add()
{
	System.out.println("A");
}
private void Add1()
{
	System.out.println("B");
}
protected void Add2()
{
	System.out.println("C");
}
void Add3()
{
	System.out.println("D");
}
public static void Add11()
{
	System.out.println("A1");
}
private void Add12()
{
	System.out.println("B2");
}
protected static void Add21()
{
	System.out.println("C3");
}
void Add31()
{
	System.out.println("D4");
}
	public static void main(String[] args) {
		Package_Class p1= new Package_Class();
		p1.Add();
		p1.Add1();
		p1.Add12();
		p1.Add2();
		p1.Add31();
		

	}

}
