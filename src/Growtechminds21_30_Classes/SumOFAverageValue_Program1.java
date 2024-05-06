package Growtechminds21_30_Classes;

public class SumOFAverageValue_Program1 {
static int sum=0;
static int average=0;
static int remainder=0;
static double sum1=0.0;
static double average1=0.0;
static double remainder1=0.0;

	public static void main(String[] args) {
		int number[]=new int[4];
		number[0]=15;
		number[1]=26;
		number[2]=37;
		number[3]=54;
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
			average=sum/number.length;
			remainder=sum%number.length;
		}
		System.out.println(sum);
		System.out.println(average);
		System.out.println(remainder);
		
		double number1[]=new double[4];
		number1[0]=11.00;
		number1[1]=27.00;
		number1[2]=39.00;
		number1[3]=52.00;
		for(double i=0.0;i<number1.length;i++)
		{
			sum1=sum1+number1[(int) i];
			average1=sum1/number1.length;
			remainder1=sum1%number1.length;
			}
		System.out.println(sum1);
		System.out.println(average1);
		System.out.println(remainder1);
		System.out.println((sum+sum1)/2);
		
	}
	


}
