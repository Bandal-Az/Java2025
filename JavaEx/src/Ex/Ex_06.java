package Ex;
import java.util.Scanner;
public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		
		int a = scanner.nextInt();
		
		if(a<1 || a>99) {
			System.out.print("(1~99)사이의 숫자가 아닙니다.");
		}
		
		int b = (a / 10)%3;
		int c = (a % 10)%3;
		
		if(b==0 && c==0) {
			System.out.print("박수짝짝");
		}
		else if(b == 0 && c != 0) {
			System.out.print("박수짝");
		}
		else if(b != 0 && c == 0) {
			System.out.print("박수짝");
	}
		scanner.close();
	}
}
