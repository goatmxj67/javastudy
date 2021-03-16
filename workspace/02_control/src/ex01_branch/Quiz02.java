package ex01_branch;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		int age;
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 입력>>");
		age = sc.nextInt();

		if (age >= 20 && age <= 100) {
			System.out.println("성인");
		} else if (age >= 17 && age < 20) {
			System.out.println("고등학생");
		} else if (age >= 14 && age < 17) {
			System.out.println("중학생");
		} else if (age >= 8 && age < 14) {
			System.out.println("초등학생");
		} else if (age <= 7 && age > 0) {
			System.out.println("미취학아동");
		} else
			System.out.println("불가능한 나이");

		sc.close();

	}

}
// (age <= 7) -> (age <= 13) -> (age <= 16) .....