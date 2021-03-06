package ex02_2d_array;

// 3. (1 ~ 100 사이 정수 대상) 369 결과 저장하고 출력하기
// 1 2 짝 4 5 짝 7 8 짝 10 
// 11 12 짝 14 15 짝 17 18 짝 20
// ...
// 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40
//... 99

public class Quiz03 {

	public static void main(String[] args) {

		String[][] s = new String[10][10];

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				int n = (i * 10) + (j + 1); // n은 1~100

				// 일의 자리와 십의 자리로 분리하기
				int units = n % 10; // 일의 자리
				int tens = n / 10; // 십의 자리

				// 369 검사
				boolean check1 = units == 3 || units == 6 || units == 9; // 일의 자리가 369이면 true
				boolean check2 = tens == 3 || tens == 6 || tens == 9; // 십의 자리가 369이면 true

				// 실제 369검사 후 저장
				if (check1 && check2) {
					s[i][j] = "짝짝";
				} else if (check1 || check2) {
					s[i][j] = "짝";
				} else {
					s[i][j] = String.valueOf(n);
				}
				System.out.print(s[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
