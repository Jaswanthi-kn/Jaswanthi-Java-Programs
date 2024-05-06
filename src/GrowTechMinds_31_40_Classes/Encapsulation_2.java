package GrowTechMinds_31_40_Classes;
//Indirectly we are updating the global variables means local to global by using this keyword ----inside the setter method
//after updating we are returning them in getter method by using return keyword
//
public class Encapsulation_2 {
private String name="Jyothika";
private int rollno=101;
private boolean isboolean;

	public String getName() 
	{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public int getRollno() 
{
	return rollno;
}

public void setRollno(int rollno) 
{
	this.rollno = rollno;
}

public boolean isIsboolean() 
{
	return isboolean;
}

public void setIsboolean(boolean isboolean) 
{
	this.isboolean = isboolean;
}

	public class Encapsule_Prm
	{
		public static void main(String[] args) {
			Encapsulation_2 w1= new Encapsulation_2();
			w1.setName("surya");
			w1.setRollno(12345);
			w1.setIsboolean(true);
			System.out.println(w1.getName());
			System.out.println(w1.getRollno());
			System.out.println(w1.isIsboolean());
			
		}
	}

}

