package Growtechminds_11_20_classes;

class Method_Parent
{
	void login()
	{
		System.out.println("Login with mobile number");
	}
}

public class Methodoverriding {

	void login()
	{
		System.out.println("Login with email ID");
	}
	public static void main(String[] args) {
		Methodoverriding m1=new Methodoverriding();
		m1.login();
		

	}

}


