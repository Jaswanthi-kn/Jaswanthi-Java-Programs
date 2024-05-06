package Assignmentsby_SDETprograms;

public class Encapsulation_Ex1 {
private double Bankbalance=1012378.50;

	public double getBankbalance()
{
	return Bankbalance;
}
public void setBankbalance(double bankbalance)
{
	this.Bankbalance = bankbalance;
}

public static void main(String[] args) {
	Encapsulation_Ex1 B1=new Encapsulation_Ex1();
	B1.setBankbalance(656665.3212);
	System.out.println(B1.getBankbalance());

	}

}
