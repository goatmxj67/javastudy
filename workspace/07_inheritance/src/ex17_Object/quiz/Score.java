package ex17_Object.quiz;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Score {

	private int kor, eng, mat;

	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public boolean equals(Object obj) {

		if (this == obj) { // p1.equals(p1)
			return true;
		}
		if (obj instanceof Score) { // p1.equals(p2)
			Score s = (Score) obj;
			if (kor == s.kor && eng == s.eng && mat == s.mat) {
				return true;
			} else {
				return false;
			}
		}
		return false; // obj가 Product이 아님
	}

	public String toString() {
		return "[국어: " + kor + ", 영어: " + eng + ", 수학: " + mat + "]";
	}

}
