package quiz04;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private String name;
	private List<Book> books = new ArrayList<Book>();

	public Library(String name) {
		this.name = name;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(int bNo) {
		for (Book book : books) {
			if (book.getBNo() == bNo) {
				books.remove(book);
				break;
			}
		}
	}
	
	public void booksInfo() {
		System.out.println("도서관: " + name);
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	/*
	public void removeBook(int bNo) {
		int removeIdx = -1;
		for (int i = 0, length = books.size(); i < length; i++) {
			if (books.get(i).getBNo() == bNo) {
				removeIdx = i;
				break;
			}
		}
		if (removeIdx == -1) {
			System.out.println(bNo + "번 Book이 없습니다.");
		} else {
			books.remove(removeIdx);
		}
	}*/

}
