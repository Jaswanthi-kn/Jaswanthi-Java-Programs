package Growtechminds21_30_Classes;

public class SumOfAverage_Values {
static int sum=0;
static int average=0;
static int remainder=0;
	public static void main(String[] args) {
		int number[]=new int[4];
		number[0]=14;
		number[0]=15;
		number[0]=57;
		number[0]=90;
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
			average=sum/number.length;
			remainder=sum%number.length;
		}
		System.out.println(sum);
		System.out.println(average);
		System.out.println(remainder);
	}

}
