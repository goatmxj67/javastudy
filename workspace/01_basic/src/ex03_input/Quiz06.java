package ex03_input;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		String regi;
		String gender;
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호를 하이픈 없이 입력하세요>>");
		regi = sc.next();
		char n = regi.charAt(6);
		// n = Integer.parseInt(regi.substring(6, 7));

		gender = (n == '1' || n == '3') ? "남자" : "여자"; // n % 2 == 1 -> 안됨
		/*
		 * 문자는 코드값을 가지고 있습니다. 문자를 연산하는 경우 "코드값"이 연산됩니다. '1' % 2 -> 49 % 2 '2' % 2 -> 50
		 * % 2 '0' -> 48 'A' -> 65 'a' -> 97
		 */

		System.out.println(gender);

		sc.close();

	}

}
