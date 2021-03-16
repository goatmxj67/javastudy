package ex01_branch;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		char point = '-';
		char grade = 'F';
		int score;
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력>>");
		score = sc.nextInt();

		switch (score % 10) {
		case 9:
		case 8:
		case 7:
			point = '+';
			break;
		case 6:
		case 5:
		case 4:
			point = '0';
		}

		switch (score / 10) {
		case 10:
			grade = 'S';
			point = ' ';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			point = ' ';
		}

		System.out.println("" + grade + point);
		// System.out.println("" + grade + point); -> S
		// System.out.println(grade + "" + point); -> S
		// System.out.println(grade + point + ""); -> 115
		// 앞에 2개 먼저 처리함.

		sc.close();

	}

}
