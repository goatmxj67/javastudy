package ex12_abstract;

public class Rectangle extends Shape {

	private int width; // 너비
	private int height; // 높이

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
