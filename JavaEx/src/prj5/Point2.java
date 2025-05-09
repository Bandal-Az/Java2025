package prj5;

public class Point2 {
	private int x, y;

	public Point2() {
		this.x = this.y = 0;

	}

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint2() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint2 extends Point2 {
	private String color;

	public ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void showColorPoint2() {
		System.out.print(color);
		showPoint2();
	}
}
