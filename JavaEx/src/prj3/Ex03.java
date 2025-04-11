package prj3;

public class Ex03 {
	
	public static void main(String[] args) {
		Circle1 pizza = new Circle1(10,"자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		Circle1 dount =new Circle1();
		dount.name = "도넛피자";
		area = dount.getArea();
		System.out.println(dount.name + "의 면적은" + area);
	}

}
