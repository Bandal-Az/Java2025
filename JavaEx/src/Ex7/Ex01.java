package Ex7;
import java.util.Vector;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Double> v = new Vector<Double>();

		while (true) {
			for (int i = 0; i < 5; i++) {
				double b = sc.nextDouble();
				v.add(b);
			}

			double M = v.get(0);
			for (int i = 0; i < v.size(); i++) {
				if (M < v.get(i)) {
					M = v.get(i);
				}
			}
			System.out.print("가장 큰 수는 " + M);
			sc.close();
		}
	}

}
