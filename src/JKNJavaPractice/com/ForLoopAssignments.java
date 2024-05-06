package JKNJavaPractice.com;

public class ForLoopAssignments {

	public static void main(String[] args) {
		 // 1 to 100 numbers printing using i--
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
	}
		/*for(int i=0;i>=100;i--)
		{
			System.out.println(i);
	} False statement*/
		// print -50 to -30 use i++
		for(int i=-50;i<=-30;i++) 
		{
			System.out.println("Print number " +i);
		} 
		//print -10 to +10 
		for(int i=-10;i<11;i++) 
		{
			System.out.println("Print number: " +i);
		} 
		for(int i=0;i<=10;i++) 
		{
			System.out.println("Print even numbers: " +i);
			i++;
		} 
		for(int i=1;i<=10;i++) 
		{
			System.out.println("Print odd numbers: " +i);
			i++;
		}    
	
	// print 1 to 100 even numbers
		for(int i=0;i<=100;i++) 
		{
			if(i%2==0)
			System.out.println("even numbers: " +i);
		} 
		// print 1 to 100 odd numbers
		for(int i=0;i<=100;i++) 
		{
			if(i%2==1)
			System.out.println("odd numbers: " +i);
		} 
		/*for(int i=200;i<500;i++)
			if(i%2==0)
			{
				System.out.println("even "+i);
			}
		for(int i=200;i<500;i++)
			if(i%2==1)
			{
				System.out.println("odd "+i);
			} */
	//	150 to 200 divisible by 7
		for(int i=150;i<=200;i++)
			if(i%7==0)
			{
				System.out.println("dividible by 7 " +i);
			}
	}
}


