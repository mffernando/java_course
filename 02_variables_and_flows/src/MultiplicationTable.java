import java.util.Iterator;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int multiplier = 0; multiplier <= 10; multiplier++) {
			System.out.println("Multiplication Table " + multiplier + ":");
			for (int count = 0; count <= 10; count++) {
				System.out.println(multiplier + " x " + count + " = " + multiplier * count);
			}
			System.out.println();
		}
	}

}
