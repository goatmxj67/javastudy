package ex01_branch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		int age;
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 입력>>");
		age = sc.nextInt();

		switch (age / 20) {
		case 1:
			System.out.println("성인");
			break;
		case 0:
			System.out.println("미성년자");
			break;
		}

		sc.close();

	}

}
// state = 0; 
// if(age >= 20) state = 1;