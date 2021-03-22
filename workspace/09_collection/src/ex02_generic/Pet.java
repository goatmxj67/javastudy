package ex02_generic;

public class Pet {

	private String name;
	private int age;

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + age + "]";
	}

}
