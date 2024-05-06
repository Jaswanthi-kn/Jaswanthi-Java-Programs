package Growtechminds_11_20_classes;

import java.util.Scanner;

public class Scannerclass_Assignment1 {
	/*int a=10;
	int b=20;
	int sum=a+b;
	System.out.println();*/

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a value:");
		float A1=s1.nextFloat();
		System.out.println("Enter b Value:");
		float A2 =s1.nextFloat();
		float sum =A1+A2;
		System.out.println("sum of a and b is: " +sum);
	  //__________________________________________________________
		//Scanner s1=new Scanner(System.in);
		System.out.println("Enter a value:");
		int B1=s1.nextInt();
		System.out.println("Enter b Value:");
		int B2 =s1.nextInt();
		int sub =B1-B2;
		System.out.println("sub of a and b is: " +sub);
		
		//_______________________________________________________
		System.out.println("Enter a value:");
		float C1=s1.nextFloat();
		System.out.println("Enter b value:");
		float C2=s1.nextFloat();
		float mul =C1*C2;
		System.out.println("Mul of a and b: " +mul);
		//_________________________________________________
		System.out.println("Enter a value:");
		double D1=s1.nextDouble();
		System.out.println("Enter b value:");
		double D2=s1.nextDouble();
		double div =D1/D2;
		System.out.println("Division of a and b: " +div);
		//_____________________________________________________________
		System.out.println("Enter a value:");
		double E1=s1.nextDouble();
		System.out.println("Enter b value:");
		double E2=s1.nextDouble();
		double Modlus =E1%E2;
		System.out.println("Modulus of a and b: " +Modlus);
		
		
		
		
	}

}
