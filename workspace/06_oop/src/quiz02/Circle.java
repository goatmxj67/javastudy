package quiz02;

public class Circle {

	private Coord center;
	private double radius;

	public Circle(Coord center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(int x, int y, double radius) {
		this.center = new Coord(x, y);
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	void info() {
		// 중심좌표 [0, 0], 반지름 1.5, 넓이 x.xx
		System.out.print("중심좌표 ");
		center.info();
		System.out.println(" 반지름 " + radius + ", 넓이 " + getArea());
	}

}
