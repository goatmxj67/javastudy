package quiz01;

public class SalaryMan extends Staff {

	private int salary;

	public SalaryMan(String name, int salary) {
		super(name); // 슈퍼클래스 Staff의 생성자를 호출
		this.salary = salary;
	}

	public int getPay() {
		return salary;
	}

}
