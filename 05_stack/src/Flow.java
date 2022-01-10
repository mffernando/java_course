
public class Flow {

	public static void main(String[] args) {
		System.out.println("start main");
		try {
			method1();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("ArithmeticException: " + e);
		}
		System.out.println("end main");
	}

	private static void method1() {
		System.out.println("start method 1");
		method2();		
		System.out.println("end method 1");
	}

	private static void method2() {
		System.out.println("start method 2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0; // force ArithmeticException
			Test t = null; // NullPointerException
			t.func();
		}
		System.out.println("end method 2");
	}
}