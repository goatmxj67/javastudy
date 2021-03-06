package ex17_Object.ex02;

public class Dog {

	private String name;

	public Dog(String name) {
		super(); // Object의 생성자 호출 (생략해도 됩니다.)
		this.name = name;
	}

	// Object클래스의 toString()을 사용하지 않기 위해서
	// toString() 메소드를 오버라이드합니다. -> Source 메뉴의 Override/Implements method
	@Override
	public String toString() {
		return "[name: " + name + "]";
	}

}
