package ex03_input;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		int score1, score2, score3;
		double avg;
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 3개를 입력하세요 >>");
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		score3 = sc.nextInt();

		avg = (score1 + score2 + score3) / 3.0;
		System.out.println("평균은 " + avg);
		sc.close();
	}

}
