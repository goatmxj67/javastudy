package quiz02;

public class Coord {

	private int x;
	private int y;

	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void info() {
		System.out.print("[" + x + ", " + y + "]");
	}

}
