package ex08_upcasting;

public class Elec {

	private int watt; // 소비전력

	public Elec(int watt) {
		super();
		this.watt = watt;
	}

	public void info() {
		System.out.println("소비전력: " + watt + "W");
	}

}
