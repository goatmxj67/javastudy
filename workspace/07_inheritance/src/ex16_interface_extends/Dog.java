package ex16_interface_extends;

public class Dog extends Pet implements Walkable {

	// Dog는 슈퍼클래스 타입이 2개입니다.
	// Pet, Walkable

	public Dog(String name) {
		super(name);
	}

}
