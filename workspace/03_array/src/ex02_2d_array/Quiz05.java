package ex02_2d_array;

import java.util.Scanner;

// 5. 영한사전
// "영어단어"와 "의미"를 배열에 저장해 두고,
// 묻고 답하는 프로그램
// 봄을 영어로 하면>> spring
// 정답
// 여름을 영어로 하면>> suummer
// 오답
// 가을을 영어로 하면>> fall
// 정답
// 겨울을 영어로 하면>> winder
// 오답
// 2문제를 맞히고, 2문제를 틀렸습니다.

public class Quiz05 {

	public static void main(String[] args) {

		String ans = "";
		Scanner sc = new Scanner(System.in);

		String[][] dict = { { "봄", "spring" }, { "여름", "summer" }, { "가을", "fall" }, { "겨울", "winter" } };

		int wrong = 0; // 틀린 문제의 갯수 count++

		for (int i = 0; i < dict.length; i++) {
			for (int j = 0; j < 1; j++) {  // 이중 for문으로 구현 안해도 됨. dict[i][0]
				System.out.print(dict[i][j] + "을 영어로 하면>>");
				ans = sc.next();
				if (ans.equalsIgnoreCase(dict[i][1])) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
					wrong++;
				}
			}
		}
		// 2문제를 맞히고, 2문제를 틀렸습니다.
		System.out.println(dict.length - wrong + "문제를 맞히고, " + wrong + "문제를 틀렸습니다.");

		sc.close();

	}

}
