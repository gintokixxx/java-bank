package bankaccount;

public class Main {

	public static void main(String[] args) {
		
		//OBJECT
		Account aceaccount = new Account("6274", 500.00, "Acecis Isidro");
		
		aceaccount.greet();
		aceaccount.deposit(500.00);
		aceaccount.withdraw(2000.00);
		aceaccount.withdraw(500.00);
		
		Account okay = new Account("0505", 1000.00, "Annie De Leon");
		
	}

}
