
public abstract class Employee {

	private String name;
	private String cpf;
	private double wage;

	// methods

	// getBonus = wage + 10%
	public double getBonus() {
		System.out.println("Employee");
		return this.wage * 0.05;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

}
