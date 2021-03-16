package ex03_input;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		double weight, height, bmi;
		Scanner sc = new Scanner(System.in);

		System.out.print("몸무게와 키를 입력하세요>>");
		weight = sc.nextDouble();
		height = sc.nextDouble();
		height /= 100;
		bmi = weight / (height * height); // Math.pow(height, 2); -> height의 제곱

		if (bmi >= 25)
			System.out.println(bmi + " 과체중");
		else if (bmi >= 20 && bmi < 25)
			System.out.println(bmi + " 정상");
		else
			System.out.println(bmi + " 저체중");

		// String healthCondition = (bmi >= 25) ? "과체중" : (bmi >= 20) ? "정상" : "저체중";

		sc.close();

	}

}
