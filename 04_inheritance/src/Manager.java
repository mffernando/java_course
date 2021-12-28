// manager inherits from the employee 
public class Manager extends Employee{

	private int password;
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public boolean auth (int password) {
		if (this.password == password) {
			return true;
		} else {
			return false;
		}
	}
	
	// getBonus = employee bonus + wage
	public double getBonus() {
		System.out.println("Manager");
		return super.getBonus() + super.getWage();
	}
	
}
