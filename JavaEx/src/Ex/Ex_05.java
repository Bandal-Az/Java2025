package Ex;
import java.util.Scanner;
public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오>>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((a+b) > c) {
			System.out.print("삼각형이 됩니다.");
		}
		else if((b+c) > a) {
			System.out.print("삼각형이 됩니다.");
		}
		else if((c+a) > b) {
			System.out.print("삼각형이 됩니다.");
		}
		else
			System.out.print("삼각형이 안됩니다.");
			
			scanner.close();
	}

}
