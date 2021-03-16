package ex03_input;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		int age;
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력하세요 >> ");
		age = sc.nextInt();

		String isAdult = age > 19 ? "성인" : "미성년자";
		System.out.println(isAdult);

		sc.close();

	}

}
