package Ex;
import java.util.Scanner;

public class Ex_08 {

	public static boolean inRect(int x, int y, int rect_x1, int rect_y1, int rect_x2, int rect_y2) {

		if ((x >= rect_x1 && x <= rect_x2) && (y >= rect_y1 && y <= rect_y2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("두 점 (x1, y1), (x2, y2)의 좌표를 입력하시오>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		if ((inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200)
				|| inRect(x1, y2, 100, 100, 200, 200) || inRect(x2, y1, 100, 100, 200, 200))) {
			System.out.print("사각형이 겹칩니다.");
		} else if ((inRect(100, 100, 200, 200, x1, y1) || inRect(200, 200, 100, 100, x2, y2)
				|| inRect(100, 100, 200, 200, x2, y1) || inRect(200, 200, 100, 100, x1, y2))) {
			System.out.print("사각형이 겹칩니다.");
		} else {
			System.out.print("사각형이 겹치지 않습니다.");
		}
		scanner.close();
	}
}
