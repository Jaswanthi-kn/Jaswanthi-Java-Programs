package Growtechminds_11_20_classes;

public class SIB_IIB_PSVM_Constructor 
// the correct order of execution is SIB,PSVM(),IIB,constructor()
{
static
{
	System.out.println("it is the SIB:" );
}
static
{
	System.out.println("it is the SIB2:" );
}
static
{
	System.out.println("it is the SIB3:" );
}
{
	System.out.println("It is the IIB:");
}
{
	System.out.println("It is the IIB 1:");
}
SIB_IIB_PSVM_Constructor()
{
	System.out.println("it is the construcotr:");
}
	public static void main(String[] args) {
		
		System.out.println("it is the mainmethod:");
		SIB_IIB_PSVM_Constructor a1= new SIB_IIB_PSVM_Constructor();
		
	}

}
