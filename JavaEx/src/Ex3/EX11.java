package Ex3;
import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();
		while (true) {
			if (op.equals("+")) {
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
			} else if (op.equals("-")) {
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calculate());
			} else if (op.equals("*")) {
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calculate());
			} else if (op.equals("/")) {
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
			}
		}
	}
}
