
public class CreateAccount {

	public static void main(String[] args) {
		// new account instance
		Account account = new Account();
		account.balance = 200;

		//Account account2 = new Account();
		//account2.balance = 50;

		System.out.println("Account Balance: " + account.balance);
		//System.out.println("Account2 Balance: " + account2.balance);

		// using deposit method
		// balance + 50 (value)
		account.deposit(550);
		System.out.println("Your new account balance is " + account.balance);
	}

}
