
public class IfConditional {
	
	public static void main(String[] args) {
		System.out.println("Conditional");
		
		int age = 14;
		int amount = 1;
		
		//if
		if (age >= 18) {
			System.out.println("You are over 18 years old!! You are "+ age +" years old.");
		}
		else if (amount >= 2) {
			System.out.println("You are not over 18 years old, but you are accompanied by "+ amount +" people!!");
		}
		else {
			System.out.println("Sorry, but you are not over 18 years old and are not accompanied!!");
		}
		
	}

}
