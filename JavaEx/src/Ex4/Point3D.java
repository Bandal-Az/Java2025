package Ex4;

public class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void moveUP() {
		z++;
	}

	public void moveDown() {
		z--;
	}

	public void move(int x, int y) {
		moves(x, y);
	}

	public void move(int x, int y, int z) {
		moves(x, y);
		this.z = z;
	}

	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + z + ")의 점";
	}
}
