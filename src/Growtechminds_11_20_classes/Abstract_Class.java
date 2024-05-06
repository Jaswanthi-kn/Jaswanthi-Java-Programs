package Growtechminds_11_20_classes;
abstract class Amazon_Auth
{ //abstarction 100%
	//hiding 100%
	abstract	void un();//abstract method
	abstract	void un_mob();//abstract method
	void login_button()//concreate methods
	{
		System.out.println("Logic");
	}	
}
abstract class Amazon_Login extends Amazon_Auth
{
	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_button()//concreate methods
	{
		System.out.println("Logic 1");
	}
}
public class Abstract_Class extends Amazon_Login
{
	static void loginwith_mob()
	{
		System.out.println("Logic 2");

	}
	public static void main(String[] args) 
	{
		Abstract_Class a1=new Abstract_Class();
		
		a1.un_as_email();
		a1.login_button();
		loginwith_mob();
	}
	
	void un_as_email() {
		System.out.println("this is overriden");
		
	}

	void un_as_mobile() {
		// TODO Auto-generated method stub
		
	}
	
	void un() {
		// TODO Auto-generated method stub
		
	}
	
	void un_mob() {
		// TODO Auto-generated method stub
		
	}

}
