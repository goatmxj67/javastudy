package quiz02;

public class Calculator {

	void addition(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	int subtraction(int a, int b) {

		return (a >= b) ? a - b : b - a;

	}

}
