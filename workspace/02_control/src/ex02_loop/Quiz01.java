package ex02_loop;

// 1. 퀴즈 맞히기
// 맞힐때까지 계속 물어보는 퀴즈입니다.

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		String s;
		Scanner sc = new Scanner(System.in);

		System.out.print("대한민국의 수도는?>>");

		while (true) {
			s = sc.next();
			if (s.equalsIgnoreCase("seoul") || s.equals("서울")) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("다시");
				System.out.print("대한민국의 수도는?>>");
			}
		}

		sc.close();

	}

}
// if (s != null) -> 입력 받기 전이면