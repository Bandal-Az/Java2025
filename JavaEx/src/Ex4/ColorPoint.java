package Ex4;

public class ColorPoint extends Point {
	private String c;

	public ColorPoint(int x, int y, String c) {
		super(x, y);
		this.c = c;
	}

	public void setXY(int x, int y) {
		moves(x, y);
	}

	public void setColor(String c) {
		this.c = c;
	}

	public String toString() {
		return c + "색의 " + "(" + super.getX() + ", " + super.getY() + ")" + "의 점";
	}

}
