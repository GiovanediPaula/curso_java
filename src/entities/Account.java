package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;

	//Construtor
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
		balance = 0.0;   //Opcional n�o � necessario declarar pois � nativo
	}	
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	//Get and Set
	public int getNumber() {
		return number;
	}

//	public void setNumber(int number) {
//		this.number = number;
//	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	
	//Fun��es
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.00;		
	}	
	
	public String toString () {
		return "Account "
				+ number 
				+ ", " 
				+ "Holder: " 
				+ holder 
				+ ", " 
				+ "Balance: "
				+ "$ "
				+ String.format("%.2f", balance);
	}

}
