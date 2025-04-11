package Ex3;

public class Rectangle {
	int x;
	int y;
	int w;
	int h;

	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public int square() {
		return w * h;
	}

public void show() {
	System.out.println("("+ x + ","+ y + ")" + "에서 크기가 " + w + "x" + h + "인 사각형");
}

public boolean contains(Rectangle r) {
	if(x<=r.x && x+w >= r.x+r.w && y<=r.y && y+h >= r.y+r.h)
				return true;
			else
				return false;
}
}
