package Growtechminds21_30_Classes;

public class Math_Class1 {
	//getclass gives the class package name_classes.class name and it is a method present in the object so it will get the class name

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.addExact(1, 3));
		System.out.println(Math.addExact(123456789, 123569872));
System.out.println(Math.subtractExact(5, 8));
System.out.println(Math.multiplyExact(4, 6));
System.out.println(Math.decrementExact(1));
System.out.println(Math.max(123, 450));
System.out.println(Math.min(10, 0));
for(int i=1;i<100;i++)
{
	System.out.println(i);

System.out.println(Math.random());
	}
Math_Class1 m1=new Math_Class1();
Math_Class1 m2=new Math_Class1();
m1.getClass();
System.out.println(m1.getClass());
System.out.println(m2.getClass());
}
}