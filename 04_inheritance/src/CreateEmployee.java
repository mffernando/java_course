
public class CreateEmployee {

	public static void main(String[] args) {

		Employee employee = new Manager();
		
		employee.setName("Fernando");
		employee.setCpf("11122233344");
		employee.setWage(1200.00);
		
		System.out.println("Name: " + employee.getName());
		System.out.println("CPF: " + employee.getCpf());
		System.out.println("Wage: " + employee.getWage());
		System.out.println("Bonus: " + employee.getBonus());

	}

}
