package Ex;
import java.util.Scanner;
public class Ex_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int a = scanner.nextInt();
		if(a<10 || a>99) {
			System.out.println("2자리의 수를 입력해 주세요");
			scanner.close();
			return;
		}
		int b = a / 10;
		int c = a % 10;
		
		if(b == c) {
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else
			System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
		scanner.close();
	}

}
