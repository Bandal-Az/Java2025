package Ex;
import java.util.Scanner;
public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번쨰 원의 중심과 반지름 입력>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		System.out.println("두번쨰 원의 중심과 반지름 입력>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int z2 = scanner.nextInt();
		double r = Math.sqrt(((x2-x)*(x2-x)) + ((y2-y)*(y2-y)));
		
		if((z + z2) > r) {
			System.out.println("두 원은 서로 겹친다.");
		}
		else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		scanner.close();
	}

}
