package Growtechminds_11_20_classes;

public class Circumfrancesof_Circle {
	//Global and local variables are used
static double pi=3.14;
static double circumfrance;
static int radius=4;
	public static void main(String[] args) {
		circumfrance();
		//circumfrance = 2*pi*radius;
		//System.out.println("circumfrence of circle is: "+circumfrance);
	}
static void circumfrance()
{
	final double pi=3.14;
	int radius=6;
	 circumfrance=2*pi*radius; 
	System.out.println("the circumfrence of circle is: " +circumfrance);
}
}
