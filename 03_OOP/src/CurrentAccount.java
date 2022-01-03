
public class CurrentAccount extends Account {

	public CurrentAccount(int agency, int number) {
		// super = Account class
		super(agency, number);
	}
	
	@Override
	public boolean withdraw(double value) {
		// withdraw + tax
		double 	newValue = value + 0.2;
		return super.withdraw(newValue);
	}

}
