package Assignmentsby_SDETprograms;

public class Swapping2Numbers {

	public static void main(String[] args) {
		/*int a=10;
		int b=20;
		System.out.println("Before swapping: " +a+" "+b);
		//logic 1 
		int t= a;
		 a=b;
		 b=t;
		 System.out.println("After swapping: " +a+ " " +b);*/
		//Logic 2
		
		/*int a=10;
		int b=20;
		a=a*b;//200
		b=a/b;//10
		a=a/b;//20
		System.out.println("After swapping the values are: "+a+" "+b); */
		// Logic 3
		/*int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping the values are: "+a+" "+b);*/
		//Logic 4
		int a=10;
		int b=20;
		b=a+b-(a=b);
		System.out.println("After swapping the values are: "+a+" "+b);
		

	}

}
