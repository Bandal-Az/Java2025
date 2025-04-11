package Ex7;
import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 5개 입력하세요.(예 : Korea 5000)");
		int m = 0;
		String mk = " ";
		for (int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >>");
			String a = sc.next();
			int a2 = sc.nextInt();
			h.put(a, a2);
		}
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		String key = " ";
		int value = 0;
		while (it.hasNext()) {
			key = it.next();
			value = h.get(key);
			if (m < value) {
				m = value;
				mk = key;
			}
		}
		System.out.println("제일 인구가 많은 나라는 (" + mk + "," + m + ")");
		sc.close();
	}

}
