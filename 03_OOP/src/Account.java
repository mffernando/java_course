
public class Account {
	double balance;
	int agency;
	int number;
	String owner;

	// account methods
	void deposit(double value) {
		this.balance = this.balance + value;
	}

}
