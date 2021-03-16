package ex03_input;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		int sales;
		double Rsales;
		String rank;
		Scanner sc = new Scanner(System.in);

		System.out.print("매출액 >> ");
		sales = sc.nextInt();
		System.out.print("등급 >> ");
		rank = sc.next();

		Rsales = rank.equalsIgnoreCase("VIP") ? sales * 0.8 : sales * 0.95; // grade == "VIP" -> 자바 스크립트에선 이렇게함
		// equalsIgnoreCase -> 대 소문자 구분 없음
		System.out.println("실매출액은 " + Rsales);

		sc.close();

	}

}
