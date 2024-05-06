package Growtechminds_11_20_classes;

class Method_Parent111
{
	void login()
	{
		System.out.println("Login with mobile number : 0");
	}
}	

class Method_Parent11 extends Method_Parent111
{
	 void login()
	{
		//super.login();
		System.out.println("Login with mobile number : 1");
		super.login();
		
	}
}	
class Method_Parent12 extends Method_Parent11
	{
		void login()
		{
			super.login();
			System.out.println("Login with mobile number: 2");
		}
	}

	public class Superkeyword_override extends Method_Parent12  {

		void login()
		{
			System.out.println("Login with email ID");
			super.login();
		}
		public static void main(String[] args) {
			System.out.println(" ");
			Superkeyword_override m1=new Superkeyword_override();
			m1.login();
			

		}

	}
