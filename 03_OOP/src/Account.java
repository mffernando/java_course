
public class Account {
	double balance;
	int agency;
	int number;
	String owner;

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

}
