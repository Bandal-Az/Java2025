package Ex;
import java.util.Scanner;
public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((b>a && c<a) || (b<a && c>a)) {
			System.out.print("중간 값은 " + a);
		}
		else if((a>b && c<b) || (b>a && c>b)) {
			System.out.print("중간 값은 " + b);
		}
		else if((a>c && b<c) || (c>a && c<b)) {
			System.out.print("중간 값은 " + c);
			
			scanner.close();
		}
	}

}
