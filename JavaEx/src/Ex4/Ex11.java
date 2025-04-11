package Ex4;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();
		switch(op) {
		case "+":
			Add add = new Add();
			add.setV(a, b);
			System.out.println(add.R());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setV(a, b);
			System.out.println(sub.R());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setV(a, b);
			System.out.println(mul.R());
			break;
		case "/":
			Div div = new Div();
			div.setV(a, b);
			System.out.println(div.R());
			break;
		}
		sc.close();
	}

}
