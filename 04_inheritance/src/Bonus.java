
public class Bonus {

	private double sum;

	// polymorphism
	public void calcBonus(Employee employee) {
		double bonus = employee.getBonus();
		this.sum = this.sum + bonus;
	}

	public double getSum() {
		return sum;
	}

}
