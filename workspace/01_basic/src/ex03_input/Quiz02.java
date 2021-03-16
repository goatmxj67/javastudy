package ex03_input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		double a, b;
		double tmp;
		Scanner sc = new Scanner(System.in);

		System.out.print("a 와 b 입력 >>");
		a = sc.nextDouble();
		b = sc.nextDouble();
		tmp = b;
		b = a;
		a = tmp;
		System.out.println("a = " + a + " " + ", b = " + b);

		sc.close();

	}

}
