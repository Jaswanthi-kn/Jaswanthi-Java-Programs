package Growtechminds_11_20_classes;
interface Youtube
{
	void watch_later();// abstract method 1
	void play(); // abstract method 2
}
interface Gmail
{
	void send(); // abstract method 1
	void inbox();// abstract method 2
}
public class Interface_Multipleinheritance implements Youtube,Gmail // multiple level inheritance
{
	static void Flipkart() // concrete method
	{
		System.out.println("this is a static concrete method");
	}
	public static void main(String[] args) {
		Interface_Multipleinheritance i3= new Interface_Multipleinheritance();
		i3.send();
		i3.inbox();
		i3.play();
		i3.watch_later();
		Flipkart();
	}

	@Override
	public void send() {
		System.out.println("this is logic 1");
		
	}

	@Override
	public void inbox() {
		System.out.println("this is logic 2");
		
	}

	@Override
	public void watch_later() {
		System.out.println("this is logic 3");
		
	}

	@Override
	public void play() {
		System.out.println("this is logic 4");
		
	}

	
}
