package JKNJavaPractice.com;

public class NonStaticMethod {
	public void add() {
		System.out.println("it is add method");
	}
private void sub() {
	System.out.println("it is sub method");
}
protected void mul() {
	System.out.println("it is mul method");
}
void div() {
	System.out.println("it is div method");
}
void modulus() {
	System.out.println("it is modulus method");
}
	public static void main(String[] args) {
		NonStaticMethod n1 = new NonStaticMethod();
		n1.add();
		n1.div();
		n1.mul();
		n1.sub();
		n1.modulus();
		System.out.println("it is all about NS method");

	}

}
