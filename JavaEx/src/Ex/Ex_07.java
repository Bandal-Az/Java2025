package Ex;
import java.util.Scanner;
public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점 (x,y)의 좌표를 입력하시오>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(100 < x && 200 > x) {
			if(100 < y && 200 > y)
				System.out.print("(x,y)는 사각형 안에 있습니다.");
			
		}
		else
			System.out.print("(x,y)는 사각형 안에 없습니다.");
		scanner.close();
	}
	
}
