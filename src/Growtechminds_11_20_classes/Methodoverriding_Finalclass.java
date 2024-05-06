package Growtechminds_11_20_classes;
//final classes we can never overload
	final class Method_Parent1
	{
		void login()
		{
			System.out.println("Login with mobile number");
		}
	}

	public class Methodoverriding_Finalclass extends Method_Parent1
	{

		void login()
		{
			System.out.println("Login with email ID");
		}
		public static void main(String[] args) {
			Methodoverriding m1=new Methodoverriding();
			m1.login();
			

		}

	}


