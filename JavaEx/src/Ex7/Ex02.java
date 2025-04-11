package Ex7;
import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> a = new ArrayList<Character>();
		System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");
		for (int i = 0; i < 5; i++) {
			char g = sc.next().charAt(0);
			a.add(g);
		}
		double b = 0;
		for (int i = 0; i < 5; i++) {
			if (a.get(i).equals('A')) {
				b = 4.0;
			}
			else if (a.get(i).equals('B')) {
				b = 3.0;
			}
			else if (a.get(i).equals('C')) {
				b = 2.0;
			}
			else if (a.get(i).equals('D')) {
				b = 1.0;
			}
			else if (a.get(i).equals('F')) {
				b = 0.0;
			}
			System.out.print(b + " ");
			
		}
		sc.close();
	}

}
