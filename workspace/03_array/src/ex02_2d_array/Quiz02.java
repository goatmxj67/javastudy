package ex02_2d_array;

// 2. 구구단의 결과만 2차원 배열에 저장하고 출력하기

// 2 4 6.. 18 
// 3 6 9 .. 27
// ...
// 9 18 27 .. 81

public class Quiz02 {

	public static void main(String[] args) {

		int[][] a = new int[8][9];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (i + 2) * (j + 1);
			}
		}

		for (int[] b : a) {
			for (int n : b) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}

	}

}
