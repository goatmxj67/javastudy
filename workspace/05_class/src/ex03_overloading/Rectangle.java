package ex03_overloading;

public class Rectangle {

	int width;
	int height;

	void set(int w, int h) {
		if (w > 0) {
			width = w;
		}
		if (h > 0) {
			height = h;
		}
	}

	void set(int n) {
		// 다른 set() 메소드를 호출해서 처리합니다.
		set(n, n);
	}

	int getArea() {
		return width * height;
	}

}
