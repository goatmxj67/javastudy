package ex01_array;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] students = {"타요", "브레드", "스폰지밥"};
		int[] scores = new int[students.length];
		int sum = 0;  // sum = scores[0]; 해도됨
		int max = 0;  // max = scores[0]; 해도됨
		int min = 100;  // min = scores[0]; 해도됨
		String top = ""; //String top = students[0];
		String bottom = "";  //String bottom = students[0];
		
		
		for(int i=0; i<students.length; i++) {
			System.out.print(students[i] + "의 점수 입력>>");
			scores[i] = sc.nextInt();
		}
		
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		double avg = sum / scores.length;
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i] >= max) {
				max = scores[i];
			  //top = students[i];
				top = students[i];
			}
		}
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i] <= min)
				min = scores[i];
			  //bottom = students[i];
				bottom = students[i];
		}
		
		System.out.println("avg = " + avg + ", max = " + max + "(" + top + ")" + ", min = " + min + "(" + bottom + ")" );
		// 이름과 같이 출력하기
		sc.close();

	}

}
