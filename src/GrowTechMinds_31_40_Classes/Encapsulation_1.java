package GrowTechMinds_31_40_Classes;

public class Encapsulation_1 // class 1
{
	/*private String un="kn.jaswanthi@123455";
	
	public String getUn() 
	{
		return un;
	}

	public void setUn(String username) 
	{
		this.un = un;
	}
	public class Encapsulation_Program1 // class 2
	{
public static void main(String[] args) {
	Encapsulation_1 e1= new Encapsulation_1();
	e1.setUn("bhargavi.kn@gmail.com");
	System.out.println(e1.getUn());

	}*/
private String name="jassu123";

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}
public static void main(String[] args) {
	Encapsulation_1 r1=new Encapsulation_1();
	r1.setName("sairam");
	//r1.setName("raghuram");
	System.out.println(r1.getName());


}
}


