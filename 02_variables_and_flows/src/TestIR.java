
public class TestIR {
	public static void main(String[] args) {

		double wage = 10.0;

		if (wage >= 1900.0 && wage <= 2800.0) {
			System.out.println("your wage is "+ wage +" and your IR is 7.5%");
		} 
		else if (wage >= 2800.01 && wage <= 3751.0) {
			System.out.println("your wage is "+ wage +" and your IR is 15%");
		}
		else if (wage >= 3751.01 && wage <= 4664.00) {
			System.out.println("your wage is "+ wage +" and your IR is 22.5%");
		}
		else {
			System.out.println("your wage is "+ wage);
		}
	}

}


//De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
//De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
//De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636