
public class Account {
	double balance;
	int agency;
	int number;
	//String owner;
	Customer owner;
	
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

}
