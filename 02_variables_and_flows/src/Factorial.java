
public class Factorial {

	public static void main(String[] args) {
		
		int factorial = 1;

		for (int number = 1; number <= 10; number++) {
			
			System.out.println(number+ "! = " + (factorial = factorial * number));
			
		}
	}
}