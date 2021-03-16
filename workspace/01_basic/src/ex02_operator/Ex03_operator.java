package ex02_operator;

public class Ex03_operator {

	public static void main(String[] args) {

		// 6. 조건 연산자 (삼항 연산자)
		// 조건식 ? true일 때 : false일 때

		int score = 70;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);

		// 문제1. 평균이 85점 이상이거나, 국어와 영어 점수가 모두 80점 이상이면 "합격", 아니면 "불합격"
		int kor = 80;
		int eng = 90;
		int avg = (kor + eng) / 2;
		String pass1 = avg >= 85 || (kor >= 80 && eng >= 80) ? "합격" : "불합격";
		// String pass1 = (kor >= 80 && eng >= 80) || avg >= 85 ? "합격" : "불합격";
		// ㄴ> 이게 더 효율적임 -> 이유는 첫 번째 요소가 단순 비교이므로
		System.out.println(pass1);

		// 문제2. 2자리(10~99) 정수 중에서 하나를 임의로 선언하고,
		// 그 값이 '카프리카 수'이면 "맞다", 아니면 "아니다"
		// 45, 55, 99가 카프리카 수 입니다.
		int n = 45; // 45 * 45 -> 2025 -> 20 25 -> 20 + 25 = 45(자신)
		int square = n * n; // Math.pow(n, 2) -> n * n
		String isKap = (square / 100) + (square % 100) == n ? "맞다" : "아니다";
		System.out.println(isKap);

	}

}
