package ex01_random;

import java.util.Scanner;

// 4. 가위바위보
// 가위바위보 >> 가위
// Player는 가위, Computer는 보, 이겼습니다.
// 가위바위보 >> 바위
// Player는 바위, Computer는 바위, 비겼습니다.
// 가위바위보 >> 보
// Player는 보, Computer는 가위, 졌습니다.
// 1승 1무 입니다.

public class Quiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] gababo = { "가위", "바위", "보" };

		int win = 0; // 이긴 횟수
		int draw = 0; // 비긴 횟수

		loop: while (true) {

			System.out.print("가위바위보>>");
			int player = 0; // 초기화 -> 가위

			switch (sc.next()) {
			case "바위":
				player = 1;
				break;
			case "보":
				player = 2;
				break;
			}
			System.out.print("Player는 " + gababo[player]);

			int computer = (int) (Math.random() * 3); // gababo 배열의 인덱스
			System.out.print(", Computer는 " + gababo[computer]);

			// player : 0, 1, 2
			// computer : 0, 1, 2
			// diff = player - computer
			// 1. 이긴 경우: diff = -2, 1, 1
			// 2. 비긴 경우: diff = 0
			// 3. 진 경우: 나머지
			switch (player - computer) {
			case -2:
			case 1:
				System.out.println(", 이겼습니다.");
				win++;
				break;
			case 0:
				System.out.println(", 비겼습니다.");
				draw++;
				break;
			default:
				System.out.println(", 졌습니다.");
				break loop;  // while문 
			}

		}

		System.out.println(win + "승 " + draw + "무");
		sc.close();

	}

}
