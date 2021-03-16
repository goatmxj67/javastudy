package ex03_input;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		int n;
		String gender;
		Scanner sc = new Scanner(System.in);

		System.out.print("성별을 의미하는 숫자 1~4중 하나를 입력하세요>>");
		n = sc.nextInt();
		gender = (n % 2 == 1) ? "남" : "여";

		System.out.println(gender);

		sc.close();

	}

}
