
public class CreateBonus {

	public static void main(String[] args) {
		Bonus bonus = new Bonus();
		Employee employee = new Employee();
		Manager manager = new Manager();
		
		employee.setWage(2000.0);
		manager.setWage(2000.0);
		
		bonus.calcBonus(employee);
		bonus.calcBonus(manager);
		
		System.out.println(bonus.getSum());
		
	}

}
