package Ex2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("곱하고자 하는 두 수 입력>>");
					try {
						int n = sc.nextInt();
						int m = sc.nextInt();
						System.out.println(n + "x" + m + "=" + n * m);
						break;
					} 
					catch (InputMismatchException e) {
						System.out.println("정수가 아닙니다.");
						sc.next();
			}
		}
		sc.close();
	}
}
