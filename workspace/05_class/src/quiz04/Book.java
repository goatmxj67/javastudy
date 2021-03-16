package quiz04;

public class Book {

	String title;
	String author;
	int price;

	void set(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}

	void info() {
		System.out.println("제목: " + title + ", 저자: " + author + ", 가격: " + price + "원");
	}

	void set(String t, String a) {
		set(t, a, 0);
	}

	void set(String t, int p) {
		set(t, "미상", p);
	}
}
