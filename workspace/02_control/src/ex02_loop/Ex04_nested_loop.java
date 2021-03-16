package ex02_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {

		/*
		 * for (int out = 1; out <= 10; out++) { for (int in = 10; in <= 50; in += 10) {
		 * System.out.println(out + ", " + in); } }
		 */

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				for (int k = 1; k < 9; k++) {
					System.out.println(i + "주차 " + j + "일차 " + k + "교시입니다.");
				}
			}
		}

	}

}
