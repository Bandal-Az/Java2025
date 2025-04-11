package Ex4;

public class Circle implements Shape {
	private int r;

	public Circle(int r) {
		this.r = r;
	}

	public void draw() {
		System.out.println("반지름이 " + r + "인 원입니다.");
	}

	public double getArea() {
		return PI * r * r ;
	}

}
