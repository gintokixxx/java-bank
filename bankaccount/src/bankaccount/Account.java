package bankaccount;

public class Account {
	
	private String number; 
	private double balance;
	private String name;
	
	public Account(String number, double balance, String name) {
		this.number = number;
		this.balance = balance;
		this.name = name;
	}
	
	public void greet() {
		System.out.println("Good Day Mr/Mrs. " + this.name + ". You have accessed your account. \n");
	}
	
	public void deposit(double depositmoney) {
		this.balance += depositmoney;
		System.out.println("Deposit Successful. New Balance : P" + this.balance);
	}
	
	public void withdraw(double withdrawmoney) {
		if(this.balance - withdrawmoney < 0) {
			System.out.println("Withdraw Unsuccessful. Only P" + this.balance + " is left");
		}
		
		else {
			this.balance -= withdrawmoney;
			System.out.println("Withdraw Successful. Current Balance is : P" + this.balance);
		}
	}
	

}
