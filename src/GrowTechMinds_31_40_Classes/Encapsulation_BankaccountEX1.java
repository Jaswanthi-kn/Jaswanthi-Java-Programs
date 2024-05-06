package GrowTechMinds_31_40_Classes;

public class Encapsulation_BankaccountEX1 {

	
		public class BankAccount {
		    private double balance;
		    
		    public double getBalance() {
		        return balance;
		    }
		    
		    public void setBalance(double balance) {
		        this.balance = balance;
		    }
		    
		    public void deposit(double amount) {
		        balance += amount;
		    }
		  //public static void main(String[] args) {
		    
		    public void withdraw(double amount)
		    {
		        if (amount > balance) 
		        {
		            System.out.println("Insufficient funds!");
		        } else 
		        {
		            balance -= amount;
		        }
		    }
		}

	}


