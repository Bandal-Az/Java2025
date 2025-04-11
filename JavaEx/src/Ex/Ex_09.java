package Ex;
import java.util.Scanner;
public class Ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원의 중심과 반지름 임력>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		double z = scanner.nextDouble();
		
		System.out.println("점 입력>>");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double r = Math.sqrt(((x2-x)*(x2-x)) + ((y2-y)*(y2-y)));
		
		if(r<z) {
			System.out.print("점 (" +x2 +" , " + y2 +")는 원 안에 있다.");
		}
		else {
			System.out.print("점 (" +x2 +" , " + y2 +")는 원 안에 없다.");
		}
		scanner.close();
	}

}
