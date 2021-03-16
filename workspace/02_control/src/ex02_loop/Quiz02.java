package ex02_loop;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("영화 평점 입력>>");

		while (true) {
			score = sc.nextInt();

			switch (score) {
			case 1:
				System.out.println("*");
				sc.close();
				break;
			case 2:
				System.out.println("**");
				sc.close();
				break;
			case 3:
				System.out.println("***");
				sc.close();
				break;
			case 4:
				System.out.println("****");
				sc.close();
				break;
			case 5:
				System.out.println("*****");
				sc.close();
				break;
			default:
				System.out.print("다시 입력>>");
			}

		}

	}
}
// 빈 문자열("")은 문자열 연결 연산(+)의 경우에 초기화로 사용됩니다.