package quiz03;

public class Student {

	String name;
	int kor;
	int eng;
	int math;

	void set(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}

	double getAverage() {
		double avg = (kor + eng + math) / 3.0;
		return avg;
	}

	String getPass() {
		return (getAverage() >= 60) ? "합격" : "불합격";
	}

}
