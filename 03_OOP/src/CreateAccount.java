
public class CreateAccount {

	public static void main(String[] args) {
		// new account instance
		Account account = new Account();
		// account.balance = 200;

		Account account2 = new Account();
		// account2.balance = 50;

		// System.out.println("Account Balance: " + account.balance);
		// System.out.println("Account2 Balance: " + account2.balance);

		// using deposit method
		// balance + 50 (value)
		// account.deposit(550);
		// System.out.println("Your new account balance is " + account.balance);

		// using withdraw method
		// account.withdraw(500);
		// boolean checkBalance = account.withdraw(400);
		// System.out.println("do you have account balance? " + checkBalance);
		// System.out.println("Your new account balance is " + account.balance);

		// using deposit method
		boolean deposited = account.transfer(1000, account2);

		if (deposited) {
			// System.out.println("Account: " + account.balance);
			// System.out.println("Account 2: " + account2.balance);
		} else {
			System.out.println("Don't have money");
		}

		// customer
		Customer customer = new Customer();
		customer.name = "Fernando";
		customer.address = "abc street";

		// account
		Account customerAccount = new Account();
		customerAccount.deposit(100);

		//customerAccount.owner = customer;
		customerAccount.setOwner(customer);
		System.out.println(customerAccount.getOwner());

		// System.out.println("Hello " + customerAccount.owner.name + "!! Your balance
		// is " + customerAccount.balance);
		
		//show private balance
		account.deposit(100);
		System.out.println(account.getBalance());

	}

}
