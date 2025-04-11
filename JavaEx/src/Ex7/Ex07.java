package Ex7;
import java.util.ArrayList;
import java.util.Scanner;

class Location {
	private int x;
	private int y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(Location loc) {
		double distance = Math.sqrt((x - loc.x) * (x - loc.x) + (y - loc.y) * (y - loc.y));
		return distance;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Location> a = new ArrayList<Location>();
		System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");

		a.add(new Location(0, 0));

		for (int i = 0; i < 5; i++) {
			System.out.print(">>");
			int x = sc.nextInt();
			int y = sc.nextInt();

			a.add(new Location(x, y));
		}
		a.add(new Location(0, 0));

		double sum = 0.0;
		for (int i = 0; i < a.size() - 1; i++) {
			double dist = a.get(i).getDistance(a.get(i + 1));
			sum += dist;

		}
		System.out.println("총 이동거리는 " + (int) (sum * 100) / 100.0);
		sc.close();
	}

}
