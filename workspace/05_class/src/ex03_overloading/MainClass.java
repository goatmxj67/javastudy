package ex03_overloading;

/*
	오버로딩(overloading)
	1. 이름이 같고, 매개변수가 다른 메소드가 있음을 의미합니다.
	2. 결과타입은 오버로딩과 상관이 없습니다.
*/
public class MainClass {

	public static void main(String[] args) {

		// 직사각형을 만들어 봅니다.
		Rectangle nemo1 = new Rectangle();
		nemo1.set(-3, -4); // 너비3, 높이4
		System.out.println("넓이: " + nemo1.getArea());

		// 정사각형을 만들어 봅니다.
		Rectangle nemo2 = new Rectangle();
		nemo2.set(-3); // nemo2.set(3, 3);
		System.out.println("넓이: " + nemo2.getArea());

	}

}
