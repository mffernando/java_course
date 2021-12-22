
public class Account {
	private double balance;
	private int agency;
	private int number;
	// String owner;
	private Customer owner;
	// static
	private static int total;

	// constructor

	public Account(int agency, int number) {
		// total accounts
		Account.total++;
		this.agency = agency;
		this.number = number;
		System.out.println("Agency: " + this.agency + " Number: " + this.number);
		System.out.println("Accounts: " + Account.total);
	}

	// account methods
	public void deposit(double value) {
		this.balance = this.balance + value;
	}

	public boolean withdraw(double value) {
		if (this.balance >= value) {
			this.balance = this.balance - value;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(double value, Account destination) {
		if (this.balance >= value) {
			this.balance = this.balance - value;
			destination.deposit(value);
			System.out.println("Deposited " + value);
			return true;
		} else {
			System.out.println("You don't have " + value);
			return false;
		}
	}

	// getters & setters

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumber() {
		return this.number;
	}

	public void getNumber(int number) {
		this.number = number;
	}

	public int getAgency() {
		return this.agency;
	}

	public void setAgency(int agency) {
		this.agency = agency;
	}

	public Customer getOwner() {
		return this.owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}
	
	public static int getTotal() {
		return Account.total;
	}

}
