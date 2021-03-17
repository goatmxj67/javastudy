package ex07_override;

public class Pizza {

	private String dough; // 도우
	private int cheese; // 치즈 양

	public Pizza(String dough, int cheese) {
		// super();
		this.dough = dough;
		this.cheese = cheese;
	}

	public void info() {
		System.out.println(dough + "(" + cheese + ")");
	}

}
