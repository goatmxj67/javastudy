package ex12_abstract;

public class Rectangle extends Shape {

	private int width; // λλΉ
	private int height; // λμ΄

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

}
