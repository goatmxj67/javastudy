package ex01_branch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("양수 입력>>");
		n = sc.nextInt();

		if (n % 2 == 0)
			System.out.println("짝수");
		else {
			if (n % 3 == 0)
				System.out.println("3의 배수");
			else
				System.out.println("홀수");
		}

		sc.close();

	}

}
// 3의 배수를 먼저 작성한다.
