package ex02_2d_array;

// 1. 인구 조사
// apt에 사는 사람 수를 초기화 해 놓고,
// 전체 사람의 수를 출력하기

public class Quiz01 {

	public static void main(String[] args) {

		int sum = 0;
		int total = 0;
		// 5층 2호
		int[][] apt = { { 1, 2 }, { 5, 2 }, { 3, 3 }, { 1, 4 }, { 5, 2 } };

		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				sum += apt[i][j];
			}
			System.out.print((i + 1) + "층에 " + sum + "명이 삽니다.");
			System.out.println();
			sum = 0;
		}

		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				total += apt[i][j];
			}
		}

		System.out.println("총 " + total + "명이 삽니다.");

	}

}
