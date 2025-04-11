package prj5;

public class Ex01 {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
