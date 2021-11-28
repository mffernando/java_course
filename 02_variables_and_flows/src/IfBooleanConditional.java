
public class IfBooleanConditional {

	public static void main(String[] args) {
		int age = 2;
		int amount = 3;
		boolean accompanied = amount >= 2;
		
		if (age >= 18 && accompanied) {
			System.out.println("Welcome!");
		}
		else {
			System.out.println("Go back!");
		}
	}
	
}
