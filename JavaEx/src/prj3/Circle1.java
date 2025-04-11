package prj3;

public class Circle1 {
	int radius;
	String name;
	
	public Circle1() {
		radius = 1; name = "";
	}
	
	public Circle1(int r, String n) {
		radius = r; name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}
