package Ex4;
public class ColorPoint2 extends Point {
	private String c;

	public ColorPoint2() {
		super(0, 0);
		c = "BLACK";
	}

	public ColorPoint2(int x, int y) {
		super(x, y);
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
