package ex01_array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] s = new String[3];

		for (int i = 0; i < s.length; i++) {
			System.out.print((i+1) +"번째 이름 입력>>");
			s[i] = sc.next();
		}

		/*
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		*/
		
		for(String n : s) {
			System.out.println(n);
		}
		
		sc.close();

	}

}
