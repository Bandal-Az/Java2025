package Ex2;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		while (true) {
			int a ;
			a = 0;
			System.out.print("과목 이름>>");
			String c = sc.next();
			if (c.equals("그만")) {
				break;
			}
			for (int i = 0; i<course.length; i++) {
				if (c.equals(course[i])) {
					System.out.println(c + "의 점수는" + score[i]);
					a = 1;
					break;
				}
			}
			

				if(a == 0) {
					System.out.println("없는 과목입니다.");
				}

		}
		sc.close();
	}
}
