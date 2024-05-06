package JKNJavaPractice.com;

public class PracticeConstructor  {
	
	PracticeConstructor(){
		System.out.println("1");
		System.out.println("it is non parameterised constructor");
	}
	PracticeConstructor(int a, int b,int c){
		System.out.println("2");
	}
	PracticeConstructor(int a,String s){
		System.out.println("3");
	}
	PracticeConstructor(String s){
		System.out.println("4");
	}
	PracticeConstructor(byte a, short b,int c,long d){
		System.out.println("5");
	}
	PracticeConstructor(String a,int c,short b,char w){
		System.out.println("6");
	}
	PracticeConstructor(String a,short b,int c,char w,boolean l,byte g,float k){
		System.out.println("7");
	}
	public static void main(String[] args) {
		PracticeConstructor p1= new PracticeConstructor();
		System.out.println("it is main method message");
		PracticeConstructor p2= new PracticeConstructor(5,"A");
		PracticeConstructor p3= new PracticeConstructor(5,12,10);
		PracticeConstructor p4= new PracticeConstructor("H");
		//PracticeConstructor p5= new PracticeConstructor(51,121,100,12345);
		//PracticeConstructor p6= new PracticeConstructor("5",12,10,'l');
		//PracticeConstructor p7= new PracticeConstructor("a",12,10,'d',false,1,1.23);
		

	}

}
