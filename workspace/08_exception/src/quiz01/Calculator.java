package quiz01;

public class Calculator {

	private int result;

	public void additon(int a) {
		result += a;
		System.out.println("현재 저장된 값: " + result);
	}

	public void subtraction(int a) {
		result -= a;
		System.out.println("현재 저장된 값: " + result);
	}

	public void multiplication(int a) {
		result *= a;
		System.out.println("현재 저장된 값: " + result);
	}

	public void division(int a) {
		result /= a;
		System.out.println("현재 저장된 값: " + result);
	}

}
