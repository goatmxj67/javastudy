package ex01_branch;

public class Ex02_switch {

	public static void main(String[] args) {

		// switch (key) key 값으로 실수, 논리 안 됨 / 정수(int, long, char), 문자열 가능
		int choice = 3;

		switch (choice) {
		case 1:
			System.out.println("1이다.");
			break; // switch문을 종료합니다.
		case 2:
			System.out.println("2이다.");
			break;
		default:
			System.out.println("1과 2가 아니다.");
			// break; 어차피 switch문은 끝나기 때문에 불필요합니다.
		}

		// 조건에 맞는 식만 계산하기 때문에 break문이 없으면 나머지 전부 다 수행한다.

	}

}
