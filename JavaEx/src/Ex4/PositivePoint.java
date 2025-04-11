package Ex4;

public class PositivePoint extends Point {
	public PositivePoint() {
		super(0, 0);
	}

	public void move(int x, int y) {
		if (x >= 0 && y >= 0) {
			super.moves(x, y);
		}
		else 
			return;
	}

	public String toString() {
		return "(" + super.getX() + "," + super.getY() + ")의 점";
	}
}
