package ex01_branch;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.print("단계 숫자 입력>>");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("기");
		case 2:
			System.out.println("승");
		case 3:
			System.out.println("전");
		case 4:
			System.out.println("결");
			break;
		default:
			System.out.println("알 수 없음");
		}

		sc.close();

	}

}
